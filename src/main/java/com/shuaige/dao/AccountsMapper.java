package com.shuaige.dao;

import com.shuaige.bean.Accounts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountsMapper {
    @Select("select * from accounts where id = #{id}")
    Accounts findById(int id);
}
