package com.example.project;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Account {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "account")
    private String acc;
    @ColumnInfo(name = "password")
    private String pwd;
    @ColumnInfo(name = "phone")
    private String phone;
    @ColumnInfo(name = "email")
    private String email;
    @ColumnInfo(name = "username")
    private String username;

    public Account() {
        this.acc = acc;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPwd() { return pwd; }

    public void setPwd(String pwd) { this.pwd = pwd; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }
}
