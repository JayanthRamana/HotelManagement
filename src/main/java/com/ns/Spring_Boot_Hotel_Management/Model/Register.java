package com.ns.Spring_Boot_Hotel_Management.Model;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "add_user")
public class Register {

    private String name;
    private String password;
    private String email;
    @Id
    private Long mobile;
    @Transient
    private String newpassword;
    @Transient
    private String confirmpassword;
    @Transient
    private Integer code;

    @Lob
    private byte[] image;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Register{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", newpassword='" + newpassword + '\'' +
                ", confirmpassword='" + confirmpassword + '\'' +
                ", code=" + code +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
