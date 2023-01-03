package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RideRepository {
    public static HashMap<String, List<Ride>> rideLists = new HashMap<>();

    public static void userData() {

        List<Ride> list1 = new ArrayList<>();

        Ride ride1 = new Ride(6, 12);
        Ride ride2 = new Ride(4, 8);
        Ride ride3 = new Ride(8, 16);
        Ride ride4 = new Ride(10, 20);

        list1.add(ride1);
        list1.add(ride2);
        list1.add(ride3);
        list1.add(ride4);

        rideLists.put("user1", list1);

        List<Ride> list2 = new ArrayList<>();

        Ride ride5 = new Ride(5, 10);
        Ride ride6 = new Ride(7, 14);
        Ride ride7 = new Ride(0.1, 2);

        list2.add(ride5);
        list2.add(ride6);
        list2.add(ride7);

        rideLists.put("user2", list2);

    }
}