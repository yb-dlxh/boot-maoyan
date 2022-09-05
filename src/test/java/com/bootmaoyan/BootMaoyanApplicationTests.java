package com.bootmaoyan;

import com.bootmaoyan.dao.FilmMapper;
import com.bootmaoyan.dao.UserMapper;
import com.bootmaoyan.pojo.User;
import com.bootmaoyan.service.impl.UserService;
import org.hamcrest.io.FileMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class BootMaoyanApplicationTests {
  @Autowired
  UserService us ;
  @Autowired
  FilmMapper fm;
    @Test
    void contextLoads() throws IOException {
      User u = new User();
      u.setPwd("1");
      u.setUsername("u1");
        System.out.println(us.selectLogin(u));
    }

    @Test
  public void test1(){
      System.out.println(fm.selectAll());
    }

}
