package com.theironyard.charlotte;

import com.github.javafaker.Faker;

public class User {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String phoneNumber;
    private int age;

    // overriding default constructor
    // making it so nobody can create a user
    // object using the "new" keyword
    private User() {

    }

    /**
     * Creates a user based off fakes data.
     * @return new random user object
     */
    public static User createUser() {
        Faker f = new Faker();
        User u = new User();

        u.name = f.name().fullName();
        u.streetAddress = f.address().streetAddress();
        u.city = f.address().city();
        u.state = f.address().state();
        u.phoneNumber = f.phoneNumber().phoneNumber();
        u.age = (int)(Math.random() * 100);

        return u;
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
