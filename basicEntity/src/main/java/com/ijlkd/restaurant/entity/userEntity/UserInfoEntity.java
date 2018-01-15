package com.ijlkd.restaurant.entity.userEntity;
import java.util.Date;
public class UserInfoEntity {

    private String userId; //userId database column USER_ID

    private String userName;//userName database column USER_NAME

    private String userPass;//userPass database column USER_PASS

    private String userStatus;//userStatus database column USER_STATUS

    private String passErrorCount;//passErrorCount database column PASS_ERROR_COUNT

    private Date   createTime;//createTime database column CREATE_TIME

    private String loginMochine;//loginMochine database column login_mochine

    private String loginTime;//loginTime database column login_time

    private String loginMac;//loginMac database column login_mac

    private String loginIp;//loginIp database column login_ip

    private String loginArea;//loginArea database column login_area

    private String userRealName;//userRealName database column user_real_name

    private String userPhone;//userPhone database column user_phone

    private String userEmail;//userEmail database column user_email

    private String isThreeLogin;//isThreeLogin database column is_three_login

    private String updateTime;//updateTime database column update_time

    private String updatePassCount;//updatePassCount database column update_pass_count

    private String updatePass;//updatePass database column update_pass


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getPassErrorCount() {
        return passErrorCount;
    }

    public void setPassErrorCount(String passErrorCount) {
        this.passErrorCount = passErrorCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoginMochine() {
        return loginMochine;
    }

    public void setLoginMochine(String loginMochine) {
        this.loginMochine = loginMochine;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginMac() {
        return loginMac;
    }

    public void setLoginMac(String loginMac) {
        this.loginMac = loginMac;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginArea() {
        return loginArea;
    }

    public void setLoginArea(String loginArea) {
        this.loginArea = loginArea;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getIsThreeLogin() {
        return isThreeLogin;
    }

    public void setIsThreeLogin(String isThreeLogin) {
        this.isThreeLogin = isThreeLogin;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePassCount() {
        return updatePassCount;
    }

    public void setUpdatePassCount(String updatePassCount) {
        this.updatePassCount = updatePassCount;
    }

    public String getUpdatePass() {
        return updatePass;
    }

    public void setUpdatePass(String updatePass) {
        this.updatePass = updatePass;
    }

    @Override
    public String toString() {
        return "UserInfoEntity{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", passErrorCount='" + passErrorCount + '\'' +
                ", createTime=" + createTime +
                ", loginMochine='" + loginMochine + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", loginMac='" + loginMac + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginArea='" + loginArea + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", isThreeLogin='" + isThreeLogin + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", updatePassCount='" + updatePassCount + '\'' +
                ", updatePass='" + updatePass + '\'' +
                '}';
    }
}
