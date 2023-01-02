package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
    public void given_DistanceAndTime_ShouldReturn_TotalFare() {
        double distance = 9.0; // distance in kilometers
        int time = 20;         // time in minutes
        double fare = cabInvoiceGenerator.calculateFare(distance, time); // Total fare calculations
        Assertions.assertEquals(110 , fare);                   // 10*9 + 1*20
    }
    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        double distance = 0.2; // distance in kilometers
        double time = 2;         // time in minutes
        double fare = cabInvoiceGenerator.calculateFare(distance, time); // Total fare calculations
        Assertions.assertEquals(5, fare);              // 10*0.2 + 1*2
    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(5, 10), new Ride(3, 6), new Ride(6, 12)};
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(3, 168);
        Assertions.assertEquals(expectedInvoiceSummary, invoiceSummary);
    }
}