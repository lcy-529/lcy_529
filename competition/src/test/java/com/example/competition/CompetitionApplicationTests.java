package com.example.competition;

import com.example.competition.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CompetitionApplicationTests {

    @Autowired
    UserService userService;


    @Test
    public void contextLoads() {
//        user user = userService.loginIn(1,"a");
//        System.out.println("该用户ID为：");
//        System.out.println(userBean.getId());
    }

}
