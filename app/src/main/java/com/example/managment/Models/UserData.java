package com.example.managment.Models;

public class UserData {

    String userName, address , phoneNumber , stats;
    int noRequest;

    public UserData(String userName, String address, String phoneNumber, String stats, int noRequest) {
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.stats = stats;
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

    public String getStats() {
        return stats;
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

    public void setStats(String stats) {
        this.stats = stats;
    }

    public void setNoRequest(int noRequest) {
        this.noRequest = noRequest;
    }
}
