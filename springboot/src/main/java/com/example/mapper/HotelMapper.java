package com.example.mapper;

<<<<<<< HEAD
import com.example.entity.Admin;
=======

>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
import com.example.entity.Hotel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

<<<<<<< HEAD
/**
 * 操作hotel相关数据接口
 */
=======
>>>>>>> f4e2c91d433cc0c81d7089310b8122f5fcda505f
public interface HotelMapper {


    void insert(Hotel hotel);

    @Select("select * from hotel where username = #{username}")
    Hotel selectByUsername(String username);

    List<Hotel> selectAll(Hotel hotel);

    void updateById(Hotel hotel);

    @Delete("delete from hotel where id = #{id}")
    void deleteById(Integer id);

    @Select("select * from hotel where id = #{id}")
    Hotel selectById(Integer id);
}
