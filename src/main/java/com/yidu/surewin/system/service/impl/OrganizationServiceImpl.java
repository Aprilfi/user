package com.yidu.surewin.system.service.impl;

import com.yidu.surewin.system.domain.Organization;
import com.yidu.surewin.system.domain.OrganizationExample;
import com.yidu.surewin.system.service.OrganizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl extends BaseServiceImpl<Organization> implements OrganizationService {


    @Override
    public List<Organization> selectByExample(OrganizationExample example) {
        return null;
    }
}
