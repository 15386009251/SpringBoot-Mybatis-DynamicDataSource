package com.avanty.service;

import com.avanty.mapper.User2Mapper;
import com.avanty.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhan
 */
@Service(value = "User2Mapper")
public class User2ServiceImpl implements User2Mapper {

    @Autowired
    User2Mapper user2Mapper;

    @Override
    public User2 find2ByName(String name) {
        return user2Mapper.find2ByName(name);
    }
}
