package com.jiangjf.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
@Entity
@Table(name = "order_info")
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid")
    private int id;

    @Column(name = "onumber")
    private String number;

    @Column(name = "oprice")
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", price=" + price +
                '}';
    }
}
