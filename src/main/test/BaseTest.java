import com.github.pagehelper.PageHelper;
import com.yidu.surewin.system.dao.OrganizationMapper;
import com.yidu.surewin.system.dao.RoleMapper;
import com.yidu.surewin.system.dao.UserMapper;
import com.yidu.surewin.system.domain.Organization;
import com.yidu.surewin.system.domain.Role;
import com.yidu.surewin.system.domain.User;
import com.yidu.surewin.system.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-orm.xml", "classpath:spring/spring-tx.xml" })
public class BaseTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrganizationMapper organizationMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void selectAllByPage() {
        int total = userMapper.getTableCount();
        PageHelper.startPage(1, 3 );

        System.out.println("******total:" + total);

        List<User> userList = userMapper.selectAll();

        for(User user : userList) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void selectById() {
        Organization organization = organizationMapper.selectByPrimaryKey("222001");

        System.out.println(organization.toString());
    }

    @Test
    public void updateUser() {
        User user = new User("111000","April",null,null,"22201","organize1","12222222222","N","2018-06-05","女","用户",null,null);

        int state = userMapper.updateByPrimaryKey(user);

        System.out.println(state);
    }

    @Test
    public void selectAllRole() {
        List<Role> roleList = roleMapper.selectAll();

        for(Role role : roleList) {
            System.out.printf(role.toString());
        }
    }
}
