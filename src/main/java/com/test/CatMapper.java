package com.test;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lenovo on 24/11/2019.
 */
@Mapper
public interface CatMapper {
    //#{name}:参数zan wei
    @Select("select * from mytable where name=#{name}")
    public List<Cat> likeName(String name);

    @Select("select name from mytable where id=#{id}")
    public String likeId(Long id);

    @Insert("insert into mytable(name) values(#{name})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public void save(Cat cat);
}
