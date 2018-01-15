package com.ijlkd.restaurant.service.impl;

import com.ijlkd.restaurant.entity.resourceEntity.ResourceEntity;
import com.ijlkd.restaurant.entity.userEntity.UserInfoEntity;
import com.ijlkd.restaurant.service.BasicService;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Rollback
@Service
public class BasicServiceImpl implements BasicService{
    public  BasicServiceImpl(){

    }

    public UserInfoEntity getUserById(String arg0) {
        return null;
    }

    public List<ResourceEntity> getResourceByUserId(UserInfoEntity userInfoEntity) {
        return null;
    }
}
