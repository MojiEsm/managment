package com.example.managment.Models;

public class UserListModel {
    String userName, address;
    String phoneNumber;
    int noRequest;

    public UserListModel(String userName, String address, String phoneNumber, int noRequest) {
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.noRequest = noRequest;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNoRequest() {
        return noRequest;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setNoRequest(int noRequest) {
        this.noRequest = noRequest;
    }
}
