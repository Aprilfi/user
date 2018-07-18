package com.yidu.surewin.system.service.impl;

import com.yidu.surewin.system.domain.RoleExample;
import com.yidu.surewin.system.domain.UserRole;
import com.yidu.surewin.system.service.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole> implements UserRoleService {
    @Override
    public List<UserRole> selectByExample(RoleExample roleExample) {
        return null;
    }
}
