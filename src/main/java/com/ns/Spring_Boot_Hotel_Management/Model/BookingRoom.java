package com.ns.Spring_Boot_Hotel_Management.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookroom")
public class BookingRoom {

    @Id
    private String roomid;
    private String username;
    private String roomno;
    private String noofadults;
    private String noofchilds;
    private String checkin;
    private String checkout;
    private String roomtype;
    private String type;

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getNoofadults() {
        return noofadults;
    }

    public void setNoofadults(String noofadults) {
        this.noofadults = noofadults;
    }

    public String getNoofchilds() {
        return noofchilds;
    }

    public void setNoofchilds(String noofchilds) {
        this.noofchilds = noofchilds;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BookingRoom{" +
                "roomid='" + roomid + '\'' +
                ", username='" + username + '\'' +
                ", roomno='" + roomno + '\'' +
                ", noofadults='" + noofadults + '\'' +
                ", noofchilds='" + noofchilds + '\'' +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                ", roomtype='" + roomtype + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
