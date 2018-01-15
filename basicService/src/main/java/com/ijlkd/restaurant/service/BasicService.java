package com.ijlkd.restaurant.service;

import com.ijlkd.restaurant.entity.resourceEntity.ResourceEntity;
import com.ijlkd.restaurant.entity.userEntity.UserInfoEntity;

import java.util.List;

public interface BasicService {
  UserInfoEntity getUserById(String arg0);
  List<ResourceEntity> getResourceByUserId(UserInfoEntity userInfoEntity);
}
