package com.example.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoomMapper {
    @Select("select * from room where type_id = #{orderId} and status = '空闲'")
    List<Room> selectByTypeId(String orderId);
}
