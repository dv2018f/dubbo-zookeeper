package com.dv.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 15:56
 * @description 描述
 */
@Data
public class UserAddress implements Serializable {

    private String id;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "UserAddress{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
