package com.example.controller;

import com.example.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class RoomController {
    @GetMapping("/selectByTypeId")
    public Result selectByTypeId(@RequestParam String orderId){
        List<Room> room = roomService.selectByTypeId(orderId);
        return Result.success(room);
    }
}
