package com.yidu.surewin.system.service;

import com.yidu.surewin.system.domain.Role;
import com.yidu.surewin.system.domain.RoleExample;

import java.util.List;

public interface RoleService extends BaseService<Role> {

    List<Role> selectByExample(RoleExample roleExample);

}
