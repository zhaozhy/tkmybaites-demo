package com.example.boot.demo.mapper;

import com.example.boot.demo.domain.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {

    Person get(Integer  id);
}
