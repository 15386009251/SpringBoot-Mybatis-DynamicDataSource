package com.avanty.mapper;

import com.avanty.pojo.User1;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhan
 */
@Mapper
public interface User1Mapper {
    User1 find1ByName(String name);
}
