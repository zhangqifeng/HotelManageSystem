package com.example.mapper;

import com.example.entity.Type;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TypeMapper {


    int insert(Type type);


    int deleteById(Integer id);


    int updateById(Type type);


    Type selectById(Integer id);


    List<Type> selectAll(Type type);

    @Select("select * from type where hotel_id = #{hotelId}")
    List<Type> selectByHotelId(Integer hotelId);
}
