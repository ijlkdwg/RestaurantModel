package com.ijlkd.restaurant.login.impl;

import com.ijlkd.restaurant.login.BaiscServiceLogin;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class BaiscLoginServiceImpl implements BaiscServiceLogin{

    public Map<String, Object> login(String loginCode) {
        if (StringUtils.isEmpty(loginCode)) {
            return null;
        } else {
            System.out.println("do something");
            return new HashMap<String,Object>();
        }
    }


}
