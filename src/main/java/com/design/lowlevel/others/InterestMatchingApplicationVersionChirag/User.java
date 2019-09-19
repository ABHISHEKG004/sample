package com.design.lowlevel.others.InterestMatchingApplicationVersionChirag;

import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private int x;
    private int y;
    private ArrayList<Hobby> hobbies;

    public User(int id, String name, int x, int y, ArrayList<Hobby> hobbies) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
}
