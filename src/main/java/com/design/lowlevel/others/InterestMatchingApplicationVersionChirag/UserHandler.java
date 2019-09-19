package com.design.lowlevel.others.InterestMatchingApplicationVersionChirag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class UserHandler {

    private Map<Integer, User> userMap;

    private Map<Hobby, Integer> hobbyIntegerMap;

    public UserHandler() {
        this.userMap = new HashMap<>();
        this.hobbyIntegerMap = new HashMap<>();
    }

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    public User getUser(int id) {
        return userMap.get(id);
    }

    private boolean isInside(int x, int y, int a, int b, int radius) {
        int deltaX = x - a;
        int deltaY = y - b;
        double result = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
        if(result <= radius)
            return true;
        else
            return false;
    }

    public ArrayList<User> getUserWithinRadius(int id, int radius) {
        User user = getUser(id);
        ArrayList<User> userWithinRadius = new ArrayList<>();
        for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
            User userMap = entry.getValue();
            if(userMap.getId() != user.getId() && isInside(user.getX(), user.getY(), userMap.getX(), userMap.getY(), radius))
                userWithinRadius.add(userMap);
        }

        return userWithinRadius;
    }

    private int commonHobbies(ArrayList<Hobby> hobby1, ArrayList<Hobby> hobby2) {
        int sum = 0;
        for(Hobby hobby : hobby1) {
            if(hobby2.contains(hobby))
                sum++;
        }
        return sum;

    }

    public ArrayList<User> getUserHobbiesWithinRadius(int id, int num, int radius) {
        User user = getUser(id);
        ArrayList<User> userWithinRadius =  getUserWithinRadius(id, radius);
        ArrayList<User> userWithHobbies = new ArrayList<>();
        for(User userRadius : userWithinRadius) {
            if(commonHobbies(user.getHobbies(), userRadius.getHobbies()) >= num)
                userWithHobbies.add(userRadius);
        }
        return userWithHobbies;
    }

    public ArrayList<User> getSortedUserWithHobbyRadius(int id, int num, int radius) {
        final User user = getUser(id);
        ArrayList<User> users = getUserHobbiesWithinRadius(id, num, radius);
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int u1 = commonHobbies(user.getHobbies(), o1.getHobbies());
                int u2 = commonHobbies(user.getHobbies(), o2.getHobbies());
                if(u1 > u2)
                    return -1;
                else
                    return 1;
            }
        });
        return users;
    }

    public void setHobbyIntegerMap() {
        for(Hobby hobby : Hobby.values()) {
            int sum = 0;
            for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
                User user = entry.getValue();
                if(user.getHobbies().contains(hobby))
                    sum++;

            }
            hobbyIntegerMap.put(hobby, sum);
        }

    }

    public int getSocialScore(int id) {

        User user = getUser(id);
        int sum = 0;
        for (Map.Entry<Hobby, Integer> entry : hobbyIntegerMap.entrySet()) {
            sum = sum + entry.getValue();
        }
        int sumUserHobby = 0;
        for(Hobby hobby : user.getHobbies()) {
            sumUserHobby = sumUserHobby + hobbyIntegerMap.get(hobby);
        }
        return (sumUserHobby * 100)/sum;

    }


}
