package com.xworkz.facbook.dto;

import java.util.Objects;

public class FacbookDTO {
    private String name;
    private Integer age;
    private String mail;

    public FacbookDTO(Integer age, String mail, String name) {
        this.age = age;
        this.mail = mail;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
        if (!(o instanceof FacbookDTO)) return false;
        FacbookDTO that = (FacbookDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(mail, that.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mail);
    }

    @Override
    public String toString() {
        return "FacbookDTO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
