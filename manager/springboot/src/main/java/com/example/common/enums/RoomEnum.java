package com.example.common.enums;

public enum RoomEnum {
    STATUS_OK("401", "..");

    public String code;
    public String status;

    RoomEnum(String code, String status) {
        this.code = code;
        this.status = status;
    }
}
