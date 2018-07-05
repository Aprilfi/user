package com.yidu.surewin.system.service;


import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.domain.UserExample;

import java.util.List;

public interface UserService extends BaseService<User> {

    List<User> selectByExample(UserExample example);

}
