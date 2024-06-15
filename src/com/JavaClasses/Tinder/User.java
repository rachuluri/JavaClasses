package com.JavaClasses.Tinder;

public class User {
    private String userName;
    private String fullName;
    private int age;
    private String gender;
    private String bio;

    public User(String userName, String fullName, int age, String gender) {
        this.userName = userName;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", fullName=" + fullName + ", age=" + age + ", gender=" + gender + "]";
    }
}