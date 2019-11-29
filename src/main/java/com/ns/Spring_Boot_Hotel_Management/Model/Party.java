package com.ns.Spring_Boot_Hotel_Management.Model;

import javax.persistence.*;

@Entity
@Table(name = "bookparty")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    private long mobile;
    private String partytype;
    private String date;
    private String halltype;
    private String capacity;

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

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getPartytype() {
        return partytype;
    }

    public void setPartytype(String partytype) {
        this.partytype = partytype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHalltype() {
        return halltype;
    }

    public void setHalltype(String halltype) {
        this.halltype = halltype;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "Party{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", mobile=" + mobile +
                ", partytype='" + partytype + '\'' +
                ", date='" + date + '\'' +
                ", halltype='" + halltype + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
