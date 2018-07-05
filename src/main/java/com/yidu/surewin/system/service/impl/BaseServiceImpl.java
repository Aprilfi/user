package com.yidu.surewin.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.yidu.surewin.system.dao.BaseMapper;
import com.yidu.surewin.system.dao.OrganizationMapper;
import com.yidu.surewin.system.dao.UserMapper;
import com.yidu.surewin.system.domain.Organization;
import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * @Author: WuHongLin
 * @Description: 使用initBaseMapper()将baseMapper实例化，service实现类是basemapper的类型
 * @Date: 14:27 2018\5\31 0031
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    protected BaseMapper<T> baseMapper;

    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected OrganizationMapper organizationMapper;

    //@Autowired
    //protected UserMapper userMapper;

    @PostConstruct
    private void initBaseMapper() throws Exception{

        //获取泛型的信息
        ParameterizedType type =(ParameterizedType) this.getClass().getGenericSuperclass();
        Class clazz = (Class)type.getActualTypeArguments()[0];

        //拼接成“泛型”Mapper字符串
        /**
         * *************************
         * 按照全称获取mapper的引用名称
         * *************************
         */
        String localField = clazz.getSimpleName().substring(0,1).toLowerCase()+clazz.getSimpleName().substring(1)+"Mapper";
        System.out.println("localField:" + localField);

        //通过反射来获取成员变量的值
        Field field=this.getClass().getSuperclass().getDeclaredField(localField);
        Field baseField = this.getClass().getSuperclass().getDeclaredField("baseMapper");

        //将baseDao来进行实例化
        baseField.set(this, field.get(this));

    }

    @Override
    public int tableCountQuery() {
        return baseMapper.getTableCount();
    }

    @Override
    public List<T> allTableQuery() {
        return baseMapper.selectAll();
    }

    @Override
    public Map<String, Object> queryByPage(int pageNumber, int pageSize) {
        Map<String,Object> result = new HashMap<String,Object>();
        int total= baseMapper.getTableCount();
        //分页查询
        PageHelper.startPage(pageNumber, pageSize);
        List<T> rows = baseMapper.selectAll();
        result.put("total",total);
        result.put("rows",rows);
        return result;
    }

    public boolean insert(T entity) {
        boolean state = false;
        int result = baseMapper.insert(entity);
        if(result == 1) {
            state = true;
        }
        return state;
    }

    public int insertSelective(T entity) {
        return baseMapper.insertSelective(entity);
    }

    public boolean deleteByPrimaryKey(String id) {
        boolean state = false;
        int result = baseMapper.deleteByPrimaryKey(id);
        if(result == 1) {
            state = true;
        }
        return state;
    }

    public List<T> selectByPrimaryKey(String id) {

        List<T> list = new ArrayList<>();

        list.add(baseMapper.selectByPrimaryKey(id));

        return list;
    }

    @Override
    public List<T> findOrganizationItem() {
        List<T> tList = baseMapper.selectAll();

        return baseMapper.selectAll();
    }

    public int updateByPrimaryKeySelective(T entity) {
        return baseMapper.updateByPrimaryKeySelective(entity);
    }

    public boolean updateByPrimaryKey(T entity) {
        boolean state = false;
            int result = baseMapper.updateByPrimaryKey(entity);
            state = false;
            if(result == 1) {
                state = true;
            }
        return state;
    }

}

