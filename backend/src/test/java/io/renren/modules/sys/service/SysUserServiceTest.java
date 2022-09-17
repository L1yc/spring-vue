package io.renren.modules.sys.service;

import io.renren.modules.sys.entity.SysUserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @ClassName SysUserServiceTest
 * @Description TODO
 * @Author liyc
 * @Date 2021/10/25 21:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SysUserServiceTest {

    @Autowired
    SysUserService sysUserService;

    @Test
    public void test() {
        SysUserEntity userEntity = new SysUserEntity();
        userEntity.setUsername("里斯");
        userEntity.setMobile("17723350437");
        sysUserService.save(userEntity);
        System.out.println(userEntity);
    }

}