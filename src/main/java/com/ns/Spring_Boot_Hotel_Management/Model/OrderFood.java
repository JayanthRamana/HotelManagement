package com.ns.Spring_Boot_Hotel_Management.Model;

import javax.persistence.*;

@Entity
@Table(name = "orderfood")
public class OrderFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String itemcode;
    private String itemname;
    private String cost;
    private Integer quantity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderFood{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", itemcode='" + itemcode + '\'' +
                ", itemname='" + itemname + '\'' +
                ", cost='" + cost + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
