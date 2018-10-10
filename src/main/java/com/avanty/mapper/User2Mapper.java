package com.avanty.mapper;

import com.avanty.pojo.User2;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhan
 */
@Mapper
public interface User2Mapper {
    User2 find2ByName(String name);
}
