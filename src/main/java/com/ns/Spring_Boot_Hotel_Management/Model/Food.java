package com.ns.Spring_Boot_Hotel_Management.Model;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String itemcode;
    private String itemname;
    private String cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", itemcode='" + itemcode + '\'' +
                ", itemname='" + itemname + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
