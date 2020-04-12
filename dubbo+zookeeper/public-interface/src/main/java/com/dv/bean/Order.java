package com.dv.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dv
 * @version 1.0
 * @date 2020/4/12 16:09
 * @description 描述
 */
@Data
public class Order implements Serializable {

    private String oid;
    private String uid;
    private String orderName;

    public Order(String oid, String uid, String orderName) {
        this.oid = oid;
        this.uid = uid;
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", uid='" + uid + '\'' +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
