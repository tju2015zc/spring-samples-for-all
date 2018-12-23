package com.heibaiying.dao;

import com.heibaiying.bean.Flow;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : heibaiying
 * @description :
 */
@Mapper
public interface OracleDao {

    List<Flow> queryById(long id);
}