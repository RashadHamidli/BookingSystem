package com.company.entity;

import java.util.List;

public class Passenger {
    private String passName;
    private String passSurname;

    public Passenger(String passName, String passSurname) {
        this.passName = passName;
        this.passSurname = passSurname;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public String getPassSurname() {
        return passSurname;
    }

    public void setPassSurname(String passSurname) {
        this.passSurname = passSurname;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passName='" + passName + '\'' +
                ", passSurname='" + passSurname + '\'' +
                '}';
    }
}
