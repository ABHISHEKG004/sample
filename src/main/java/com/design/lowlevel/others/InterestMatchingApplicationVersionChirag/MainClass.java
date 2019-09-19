package com.design.lowlevel.others.InterestMatchingApplicationVersionChirag;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        UserHandler userHandler = new UserHandler();

        setUserData(userHandler);
        userHandler.setHobbyIntegerMap();

        System.out.println("hey test started");



        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter user Id");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter option 1 2 3 4");
            int input = sc.nextInt();
            sc.nextLine();

            ArrayList<User> users;
            int radius;
            int num;
            switch (input) {
                case 1:
                    System.out.println("Enter radius");
                    radius = sc.nextInt();
                    sc.nextLine();
                    users = userHandler.getUserWithinRadius(id, radius);
                    for (User userList : users) {
                        System.out.println(userList.getName());
                    }
                    break;
                case 2:
                    System.out.println("Enter num_hobby radius");
                    num = sc.nextInt();
                    radius = sc.nextInt();
                    users = userHandler.getUserHobbiesWithinRadius(id, num, radius);
                    for (User userList : users) {
                        System.out.println(userList.getName());
                    }
                    break;
                case 3:
                    System.out.println("Enter num_hobby radius");
                    num = sc.nextInt();
                    radius = sc.nextInt();
                    users = userHandler.getSortedUserWithHobbyRadius(id, num, radius);
                    for (User userList : users) {
                        System.out.println(userList.getName());
                    }
                    break;
                case 4:
                    System.out.println(userHandler.getSocialScore(id));
                    break;
            }


        }



    }

    private static void setUserData(UserHandler userHandler) {

        ArrayList<Hobby> hobbiesA = new ArrayList<>();
        hobbiesA.add(Hobby.RUNNING);
        hobbiesA.add(Hobby.BIKING);
        hobbiesA.add(Hobby.TREKKING);
        hobbiesA.add(Hobby.READING);
        User userA = UserFactory.getUser(1, "A", 0, 0, hobbiesA);

        ArrayList<Hobby> hobbiesB = new ArrayList<>();
        hobbiesB.add(Hobby.SKETCHING);
        hobbiesB.add(Hobby.MUSIC);
        hobbiesB.add(Hobby.PAINTING);
        User userB = UserFactory.getUser(2, "B", 3, 4, hobbiesB);

        ArrayList<Hobby> hobbiesC = new ArrayList<>();
        hobbiesC.add(Hobby.RUNNING);
        hobbiesC.add(Hobby.TREKKING);
        User userC = UserFactory.getUser(3, "C", 5, 4, hobbiesC);


        ArrayList<Hobby> hobbiesD = new ArrayList<>();
        hobbiesD.add(Hobby.SKETCHING);
        hobbiesD.add(Hobby.BIKING);
        User userD = UserFactory.getUser(4, "D", 6, 3, hobbiesD);


        ArrayList<Hobby> hobbiesE = new ArrayList<>();
        hobbiesE.add(Hobby.RUNNING);
        hobbiesE.add(Hobby.READING);
        hobbiesE.add(Hobby.TREKKING);
        User userE = UserFactory.getUser(5, "E", 7, 4, hobbiesE);

        ArrayList<Hobby> hobbiesF = new ArrayList<>();
        hobbiesF.add(Hobby.RUNNING);
        hobbiesF.add(Hobby.BIKING);
        hobbiesF.add(Hobby.TREKKING);
        hobbiesF.add(Hobby.READING);
        User userF = UserFactory.getUser(6, "F", 9, 13, hobbiesF);

        userHandler.addUser(userA);
        userHandler.addUser(userB);
        userHandler.addUser(userC);
        userHandler.addUser(userD);
        userHandler.addUser(userE);
        userHandler.addUser(userF);
    }
}
