package com.yidu.surewin.system.service.impl;

import com.yidu.surewin.system.domain.Role;
import com.yidu.surewin.system.domain.RoleExample;
import com.yidu.surewin.system.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

    @Override
    public List<Role> selectByExample(RoleExample roleExample) {
        return null;
    }

}
