package com.ijlkd.restaurant.service.impl;

import com.ijlkd.restaurant.service.BasicService;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Rollback
@Service
public class BasicServiceImpl implements BasicService{
    public  BasicServiceImpl(){

    }

}
