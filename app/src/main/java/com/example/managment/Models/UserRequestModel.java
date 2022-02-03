package com.example.managment.Models;

public class UserRequestModel {
    String Name, stats , Address , phoneNumber;

    public UserRequestModel(String name, String stats, String address,String phoneNumber) {
        Name = name;
        this.stats = stats;
        Address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public String getStats() {
        return stats;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
