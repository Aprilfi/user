package com.yidu.surewin.system.dao;

import com.yidu.surewin.system.domain.Organization;
import com.yidu.surewin.system.domain.OrganizationExample;
import java.util.List;

public interface OrganizationMapper extends BaseMapper<Organization> {

    List<Organization> selectByExample(OrganizationExample example);

}