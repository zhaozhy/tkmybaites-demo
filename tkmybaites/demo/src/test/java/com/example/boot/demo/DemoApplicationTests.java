package com.example.boot.demo;

import com.example.boot.demo.Service.PersonService;
import com.example.boot.demo.domain.Person;
import com.example.boot.demo.mapper.MyPersonBaseMapper;
import com.example.boot.demo.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.boot.demo.mapper")
public class DemoApplicationTests {

    @Resource
    private PersonMapper personmapper;

    @Autowired
    private PersonService  ps;

    @Test
    public void contextLoads() {
        Person p= personmapper.get(1);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getId());

    }

    @Test
    public void contextLoads1() {

        ps.test();
    }

}
