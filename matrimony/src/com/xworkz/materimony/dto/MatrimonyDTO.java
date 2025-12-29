package com.xworkz.materimony.dto;

import java.util.Objects;

public class MatrimonyDTO {
    private String name;
    private int age;
    private String email;

    public MatrimonyDTO(int age, String email, String name) {
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatrimonyDTO)) return false;
        MatrimonyDTO that = (MatrimonyDTO) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public String toString() {
        return "MatrimonyDTO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
