package com.design.lowlevel.others.InterestMatchingApplicationVersionChirag;

public class Util {

    private static int user_id = 0;

    public static int getUserId() {
        user_id = user_id + 1;
        return user_id;
    }
}
