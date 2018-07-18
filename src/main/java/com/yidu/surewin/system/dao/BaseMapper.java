package com.yidu.surewin.system.dao;

import com.yidu.surewin.system.domain.User;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @Author: WuHongLin
 * @Description: 将通用的方法抽取在BaseMapper中，
 * @Date: 2018-7-3
 */
public interface BaseMapper<T> {

    int getTableCount();

    List<T> selectAll(T t);

    int insert(T entity);

    int insertSelective(T entity);

    int deleteByPrimaryKey(String id);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T entity);

    int updateByPrimaryKey(T entity);

}
