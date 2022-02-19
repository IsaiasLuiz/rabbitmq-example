package com.rabbitproducer.domain.resource;

public class UserResource {
    private String name;

    private String mail;

    private String age;

    private String zipCode;

    public UserResource(String name, String mail, String age, String zipCode) {
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.zipCode = zipCode;
    }

    public UserResource() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "UserResource{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age='" + age + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
