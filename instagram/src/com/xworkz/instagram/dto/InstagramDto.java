package com.xworkz.instagram.dto;

import java.util.Objects;

public class InstagramDto {
    private String name;
    private Integer age;
    private String location;
    private String number;

    public InstagramDto(int age, String location, String name, String number) {
        this.age = age;
        this.location = location;
        this.name = name;
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InstagramDto)) return false;
        InstagramDto that = (InstagramDto) o;
        return age == that.age && number == that.number && Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, location, number);
    }

    @Override
    public String toString() {
        return "InstagramDto{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", number=" + number +
                '}';
    }
}
