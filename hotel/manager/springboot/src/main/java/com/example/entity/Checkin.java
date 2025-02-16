package com.example.entity;

import java.io.Serializable;

public class Checkin implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 订单ID */
    private String orderId;
    /** 分类ID */
    private Integer typeId;
    /** 酒店ID */
    private Integer HotelId;
    private Integer userId;
    private Integer roomId;
    private String inTime;
    private String outTime;

    private String typeName;
    private String hotelName;
    private String userName;
    private String roomName;

    public Checkin() {
    }

    public Checkin(Integer id, String orderId, Integer typeId, Integer hotelId, Integer userId, Integer roomId, String inTime, String outTime, String typeName, String hotelName, String userName, String roomName) {
        this.id = id;
        this.orderId = orderId;
        this.typeId = typeId;
        HotelId = hotelId;
        this.userId = userId;
        this.roomId = roomId;
        this.inTime = inTime;
        this.outTime = outTime;
        this.typeName = typeName;
        this.hotelName = hotelName;
        this.userName = userName;
        this.roomName = roomName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getHotelId() {
        return HotelId;
    }

    public void setHotelId(Integer hotelId) {
        HotelId = hotelId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
