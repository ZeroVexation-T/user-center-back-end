package com.tang.usercenter02.service;

import com.tang.usercenter02.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * 用户服务测试
 *
 * @author: tang
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("catTang");
        user.setUserAccount("catTang");
        user.setAvatarUrl("https://images.zsxq.com/Fvz5adK4klcL-aGKtRG4Ix-vc8lx?e=1719763199&token=kIxbL07-8jAj8w1n4s9zv64FuZZNEATmlU_Vm6zD:zzwNUgJ5DybAr2HShOu_PszZw4Y=");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("123");
        user.setEmail("456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void userRegister() {
        // 1. 密码为空
        String userAccount = "tang";
        String userPassword = "";
        String checkPassword = "12345678";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 2. 账户长度 < 4
        userAccount = "ta";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 3. 密码长度 < 8
        userAccount = "tang";
        userPassword = "123456";
        checkPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 4. 账户带空格
        userAccount = "ta ng";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 5. 账户带特殊字符
        userAccount = "ta!ng";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

        // 6. 成功案例
        userAccount = "catTang";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);

    }
}