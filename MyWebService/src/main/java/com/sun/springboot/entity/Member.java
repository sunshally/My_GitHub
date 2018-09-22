package com.sun.springboot.entity;

public class Member {
    Integer id;
    String passWad;
    String userName;

    public Member(){

    }

    public Member(Integer id,String passWad,String userName){
        this.id = id;
        this.passWad = passWad;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassWad() {
        return passWad;
    }

    public void setPassWad(String passWad) {
        this.passWad = passWad;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString(){
        return "ID: " + id + "; User: " + userName + "; passWad: " + passWad;
    }
}
