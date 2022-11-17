package com.example.demo.jdbc;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonDAO {
    List<PersonDTO> list();
    int insert(String name, String text);
}

