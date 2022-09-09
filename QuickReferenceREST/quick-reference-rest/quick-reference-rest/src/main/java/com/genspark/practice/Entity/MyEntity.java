package com.genspark.practice.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_myEntity")
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int myId;

    private String myName;
    private int myAge;
    private String myHairColor;

    public MyEntity() {
    }

    public MyEntity(String myName, int myAge, String myHairColor) {
        this.myName = myName;
        this.myAge = myAge;
        this.myHairColor = myHairColor;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyHairColor() {
        return myHairColor;
    }

    public void setMyHairColor(String myHairColor) {
        this.myHairColor = myHairColor;
    }

}
