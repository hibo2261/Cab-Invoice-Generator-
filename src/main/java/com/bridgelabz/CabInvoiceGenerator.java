package com.bridgelabz;

public class CabInvoiceGenerator {
    private static final int COST_PER_MINUTE = 1;   //    min cost per minute
    private static final double COST_PER_KILOMETER = 10;    //  min cost per kilometer
    private static final double MIN_FARE = 5;   //  min fare
    public double calculateFare(double distance, double time) {

        double totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
        return Math.max(totalFare, MIN_FARE);
    }

    public double calculateFare(Ride[] rides) {

        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}