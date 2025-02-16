package com.example.common.enums;

public enum RoomEnum {
    STATUS_OK("空闲"),
    STATUS_NO("占用");


    public String status;

    RoomEnum(String status) {
        this.status = status;
    }
}
