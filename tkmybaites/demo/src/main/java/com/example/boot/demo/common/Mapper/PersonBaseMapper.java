package com.example.boot.demo.common.Mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PersonBaseMapper<T> extends BaseMapper<T>, MySqlMapper<T> {
}
