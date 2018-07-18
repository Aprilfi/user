package com.yidu.surewin.system.controller;

import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.service.*;
import com.yidu.surewin.system.util.ReadPropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    @Autowired
    protected UserService userService;

    @Autowired
    protected OrganizationService organizationService;

    @Autowired
    protected RoleService roleService;

    @Autowired
    protected UserRoleService userRoleService;

    //@Autowired
    //protected EmailService emailService;

    /**
     * @return 返回配置项目的路径：http://localhost:8080/user
     */
    public String getProjectPath() {
        return ReadPropertiesUtil.readProp("projectPath");
    }

}
