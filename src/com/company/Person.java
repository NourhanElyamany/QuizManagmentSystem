package com.company;

public class Person {
    int Id;
    String username;

    public Person(int id, String username) {
        this.Id = id;
        this.username = username;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
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
