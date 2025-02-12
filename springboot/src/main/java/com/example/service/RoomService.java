package com.example.service;

import com.example.entity.Orders;
import com.example.mapper.OrdersMapper;

import javax.annotation.Resource;
import java.util.List;

public class RoomService {
    @Resource
    private OrdersMapper ordersMapper;
    public List<Room> selectByTypeId(String orderId){
        Orders orders = ordersMapper.selectByOrderId(orderId);
        return roomMapper.selectByTypeId(orders.getTypeId());
    }
}
