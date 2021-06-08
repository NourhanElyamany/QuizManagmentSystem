package com.company;

public class Person {
    static String Id;
    static String username;

    public Person(String id, String username) {
        this.Id = id;
        this.username = username;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                '}';
    }
}
