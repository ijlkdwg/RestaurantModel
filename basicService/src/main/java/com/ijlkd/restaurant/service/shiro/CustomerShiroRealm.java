package com.ijlkd.restaurant.service.shiro;

import com.ijlkd.restaurant.entity.resourceEntity.ResourceEntity;
import com.ijlkd.restaurant.entity.userEntity.UserInfoEntity;
import com.ijlkd.restaurant.service.BasicService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerShiroRealm extends AuthorizingRealm {
    @Autowired
    private BasicService basicService;

    /**
     * must basicService get set
     *
     * @return
     */
    public BasicService getBasicService() {
        return basicService;
    }

    public void setBasicService(BasicService basicService) {
        this.basicService = basicService;
    }

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用,负责在应用程序中决定用户的访问控制的方法
     */

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UserInfoEntity userInfoEntity= (UserInfoEntity) principalCollection.getPrimaryPrincipal();
        List<ResourceEntity> resourceByUserId = basicService.getResourceByUserId(userInfoEntity);
        Set<String> paramSet = new HashSet<String>();
        for(ResourceEntity resEntity : resourceByUserId){

        }
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(paramSet);
        return info;
    }
    /**
     * 认证回调函数，登录信息和用户验证信息验证
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userCode = null;
        if(null != authenticationToken.getPrincipal()){
            //获取 用户登录名；
            userCode = authenticationToken.getPrincipal().toString();
        }
        String userPass = null;
        if(null != authenticationToken.getCredentials()){
            //获取密码
            userPass = new String ((char[]) authenticationToken.getCredentials());
        }
        UserInfoEntity userInfoEntity = basicService.getUserById(userCode);
        if(null == userInfoEntity){
            throw new UnknownAccountException();//用户名错误
        }
        if(!userPass.equals(userInfoEntity.getUserPass())){
            throw new IncorrectCredentialsException();//密码不对
        }
        if(!"1".equals(userInfoEntity.getUserStatus())){
            throw new DisabledAccountException();
        }
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute("userInfo",userInfoEntity);
        Map<ResourceEntity, List<ResourceEntity>> resLevelMap = null;
        //basicService.getResourceByUser(userInfoEntity);
        session.setAttribute("resourceMap",resLevelMap);//资源菜单
        return null;
    }
}
