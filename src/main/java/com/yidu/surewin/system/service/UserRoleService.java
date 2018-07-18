package com.yidu.surewin.system.service;

import com.yidu.surewin.system.domain.Role;
import com.yidu.surewin.system.domain.RoleExample;
import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.domain.UserRole;

import java.util.List;

public interface UserRoleService extends BaseService<UserRole> {

    List<UserRole> selectByExample(RoleExample roleExample);

}
