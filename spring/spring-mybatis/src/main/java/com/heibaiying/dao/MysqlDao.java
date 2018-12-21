package com.heibaiying.dao;

import com.heibaiying.bean.Relation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : heibaiying
 * @description :
 */

@Mapper
public interface MysqlDao {

    List<Relation> queryById(String id);
}
