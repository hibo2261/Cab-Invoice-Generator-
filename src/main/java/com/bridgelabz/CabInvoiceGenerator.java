package com.bridgelabz;


import java.util.ArrayList;
import java.util.List;
public class CabInvoiceGenerator {
    /*
     *  variables to store costPerKilometer, costPerMinute, minFare
     */
    double costPerKilometer;
    double costPerMinute;
    double minFare;
    /**
     *  created calculateFare method to calculate fare for single ride
     */
    public double calculateFare(String rideType, double distance, double time) {
        /*
         *  check type of ride, use respective parameters to calculate fare
         *  used Math.max to return minimum fare if it is less
         */
        if (rideType.equalsIgnoreCase("Premium")) {
            costPerKilometer = 15;
            costPerMinute = 2;
            minFare = 20;
        } else {
            costPerKilometer = 10;
            costPerMinute = 1;
            minFare = 5;
        }
        double fare = distance * costPerKilometer + time * costPerMinute;
        return Math.max(fare, minFare);
    }
    /**
     *  created calculateTotalFare method to calculate total fare for multiple rides
     */
    public InvoiceSummary calculateTotalFare(String userId) {
        /*
         *  calling UsersData.getData() to get stored data of rides of users
         *  store data of user in rideList and used for loop to iterate it
         *  and pass data to calculateFare method and calculate total fare
         */
        double totalFare = 0;
        UsersData.getData();
        ArrayList<Ride> rideList = UsersData.rideLists.get(userId);
        for (Ride ride : rideList) {
            totalFare += this.calculateFare(ride.rideType, ride.distance, ride.time);
        }
        return new InvoiceSummary(rideList.size(), totalFare);
    }
}