package com.yidu.surewin.system.service.impl;

import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.domain.UserExample;
import com.yidu.surewin.system.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User>
        implements UserService {

    @Override
    public List<User> selectByExample(UserExample example) {
        return null;
    }


}
