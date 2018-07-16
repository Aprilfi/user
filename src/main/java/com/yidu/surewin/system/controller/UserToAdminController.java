package com.yidu.surewin.system.controller;

import com.yidu.surewin.system.dao.BaseMapper;
import com.yidu.surewin.system.domain.Organization;
import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.service.BaseService;
import com.yidu.surewin.system.util.GeneralUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/admin")
public class UserToAdminController extends BaseController {

    @ResponseBody
    @RequestMapping("/findByPage.do")
    public Map<String, Object> findByPage(int pageSize, int pageNumber
            , String username, String organizationid
            , String phonenumber, String useable
            , String gender) {

        System.out.println("pagesize:"+pageSize+" pagenumber:"+pageNumber);

        System.out.println(username + "-----" + organizationid + "-----" + phonenumber + "-----" + useable + "-----" + gender);

        User user = new User(username, organizationid, phonenumber, useable, gender);

        return userService.queryByPage(pageNumber, pageSize, user);
    }

    @RequestMapping("/user.do")
    public String toOrders() {
        return "user";
    }

    @RequestMapping("/user_role.do")
    public String toOrdersAndRole() {
        return "user_role";
    }

    @ResponseBody
    @RequestMapping("/findByOrganizationId.do")
    public List<Organization> findByOrganizationId(HttpServletRequest request) {
        String parentid = request.getParameter("parentid");
        System.out.println("parentid:"+parentid);
        return organizationService.selectByPrimaryKey(parentid);
    }

    @ResponseBody
    @RequestMapping("/updateById.do")
    public boolean updateUser(User user) {
        System.out.println(user.toString());
        return userService.updateByPrimaryKey(user);
    }

    @ResponseBody
    @RequestMapping("/deleteById.do")
    public boolean deleteById(String ids) {
        System.out.println("userid:" + ids);
        return userService.deleteByPrimaryKey(ids);
    }

    @ResponseBody
    @RequestMapping("/findOrganizationItem.do")
    public List<Organization> findOrganizationItem() {
        return organizationService.findOrganizationItem();
    }

    @ResponseBody
    @RequestMapping("/addUser.do")
    public boolean addUser(User user) {
        user.setUserid(GeneralUtils.generateId());

        Map<String, Object> map = GeneralUtils.generatePas("123456");

        user.setPassword((String)map.get("password"));

        user.setSalt((String)map.get("salt"));

        user.setBirthdate("1990-01-01");

        user.setPhonenumber("null");

        user.setUseabe("N");

        System.out.println("user:" + user.toString());
        return userService.insert(user);
    }

}
