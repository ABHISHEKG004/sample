package com.design.lowlevel.others.InterestMatchingApplicationVersionChirag;

import java.util.ArrayList;

public class UserFactory {

    public static User getUser(int id, String name, int x, int y, ArrayList<Hobby> hobbies) {
        return new User(id, name, x, y, hobbies);
    }

}
