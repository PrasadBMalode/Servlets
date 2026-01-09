package com.xworkz.snapchat.dto;

public class InstagramDto {
    private String name;
    private long number;
    private String password;

    public InstagramDto(String name, long number, String password) {
        this.name = name;
        this.number = number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "InstagramDto{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", password='" + password + '\'' +
                '}';
    }
}
