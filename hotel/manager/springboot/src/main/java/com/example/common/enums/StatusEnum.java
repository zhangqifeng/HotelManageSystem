package com.example.common.enums;

public enum StatusEnum {
    // 管理员
    CHECKING("Checking"),  // 审核中
    APPROVED("Approved"),  // 已批准
    REJECTED("Rejected"),  // 已拒绝
    INACTIVE("Inactive");  // 未激活

    // 成员变量
    public final String status;

    // 构造方法
    StatusEnum(String status) {
        this.status = status;
    }

    // 获取状态的方法（可选）
    public String getStatus() {
        return status;
    }
}
