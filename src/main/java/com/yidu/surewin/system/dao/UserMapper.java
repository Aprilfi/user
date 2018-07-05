package com.yidu.surewin.system.dao;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.domain.UserExample;
import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> selectByExample(UserExample example);
}