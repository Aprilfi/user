package com.yidu.surewin.system.service;

import com.yidu.surewin.system.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: WuHongLin
 * @Description: 将通用的业务方法抽取到BaseService中
 * @Date: 16:25 2018\5\31 0031
 */
public interface BaseService<T> {

    int tableCountQuery();

    List<T> allTableQuery(T t);

    Map<String, Object> queryByPage(int pageNumber, int pagesize, T t);

    boolean insert(T entity);

    int insertSelective(T entity);

    boolean deleteByPrimaryKey(String id);

    List<T> selectByPrimaryKey(String id);

    List<T> findOrganizationItem(T t);

    int updateByPrimaryKeySelective(T entity);

    boolean updateByPrimaryKey(T entity);

}
