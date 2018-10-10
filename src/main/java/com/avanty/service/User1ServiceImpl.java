package com.avanty.service;

import com.avanty.dds.TargetDataSource;
import com.avanty.mapper.User1Mapper;
import com.avanty.pojo.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhan
 */
@Service(value = "User1Mapper")
public class User1ServiceImpl implements User1Mapper {

    @Autowired
    User1Mapper user1;

    @Override
    @TargetDataSource(value = "master")
    public User1 find1ByName(String name) {
        return user1.find1ByName(name);
    }
}
