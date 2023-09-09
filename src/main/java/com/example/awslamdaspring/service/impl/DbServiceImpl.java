package com.example.awslamdaspring.service.impl;

import com.example.awslamdaspring.service.DbService;
import org.springframework.stereotype.Service;

@Service
public class DbServiceImpl implements DbService {

    @Override
    public String getPassword() {
        return "admin123";
    }
}
