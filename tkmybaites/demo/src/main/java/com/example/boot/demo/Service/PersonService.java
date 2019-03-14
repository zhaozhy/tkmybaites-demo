package com.example.boot.demo.Service;

import com.example.boot.demo.domain.Person;
import com.example.boot.demo.mapper.MyPersonBaseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonService {

    @Resource
    MyPersonBaseMapper  myPersonBaseMapper;

    public  void  test()
    {
        Person p =new Person();
        p.setName("ss111111");
        p.setAge(33);

        myPersonBaseMapper.insert(p);
    }

}
