package com.yidu.surewin.system.service;

import com.yidu.surewin.system.domain.Organization;
import com.yidu.surewin.system.domain.OrganizationExample;
import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.domain.UserExample;

import java.util.List;

public interface OrganizationService extends BaseService<Organization> {

    List<Organization> selectByExample(OrganizationExample example);

}
