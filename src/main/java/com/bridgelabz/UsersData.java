package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;


public class UsersData {
    /*
     *  created object of HashMap to store multiple ride data for multiple users
     */
    public static HashMap<String , ArrayList<Ride>> rideLists = new HashMap<>();
    /**
     *  created getData method to store multiple ride data for "user1" and "user2"
     */
    public static void getData() {
        /*
         *  created user1Rides object of ArrayList to store multiple ride data of "user1"
         *  created four objects of class Ride and rideType, distance, time
         *  used add method to add all Ride object to user1Rides ArrayList
         *  then adding that ArrayList to HashMap for key userId = "user1"
         */

        ArrayList<Ride> user1Rides = new ArrayList<>();

        Ride ride1 = new Ride("Premium", 0.5, 5);
        Ride ride2 = new Ride("Normal", 4, 8);
        Ride ride3 = new Ride("Premium", 8, 16);
        Ride ride4 = new Ride("Normal", 0.2, 2);

        user1Rides.add(ride1);
        user1Rides.add(ride2);
        user1Rides.add(ride3);
        user1Rides.add(ride4);

        rideLists.put("user1", user1Rides);

        /*
         *  created user2Rides object of ArrayList to store multiple ride data of "user2"
         *  created four objects of class Ride and rideType, distance, time
         *  used add method to add all Ride object to user2Rides ArrayList
         *  then adding that ArrayList to HashMap for key userId = "user2"
         */

        ArrayList<Ride> user2Rides = new ArrayList<>();

        Ride ride5 = new Ride("Normal", 5, 10);
        Ride ride6 = new Ride("Premium", 7, 14);
        Ride ride7 = new Ride("Normal", 0.1, 2);

        user2Rides.add(ride5);
        user2Rides.add(ride6);
        user2Rides.add(ride7);

        rideLists.put("user2", user2Rides);
    }
}