package com.yidu.surewin.system.service;

import java.util.List;
import java.util.Map;

/**
 * @Author: WuHongLin
 * @Description: 将通用的业务方法抽取到BaseService中
 * @Date: 16:25 2018\5\31 0031
 */
public interface BaseService<T> {

    int tableCountQuery();

    List<T> allTableQuery();

    Map<String, Object> queryByPage(int pageNumber, int pagesize);

    boolean insert(T entity);

    int insertSelective(T entity);

    boolean deleteByPrimaryKey(String id);

    List<T> selectByPrimaryKey(String id);

    List<T> findOrganizationItem();

    int updateByPrimaryKeySelective(T entity);

    boolean updateByPrimaryKey(T entity);

}
