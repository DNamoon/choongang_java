package com.example.demo9.jdbc;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IuserDao {

    @Select("select * from mini_pro")
    List<UserDTO> list();

    @Insert("insert into mini_pro (name, text) values (#{name}, #{text})")
    int insert(String name, String text);  //몇 건 입력되었는지 int로 반환

    @Delete("delete from mini_pro where id= #{id}")
    int delete(int id);

    @Update("update mini_pro set text= #{text} where name = #{name}")
    int update(String name, String text);
}
