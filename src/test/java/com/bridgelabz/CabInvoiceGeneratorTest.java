package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class CabInvoiceGeneratorTest {
    /*
     *  created object of class CabInvoiceGenerator
     */
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    /**
     *  test method should return minimum fare (5)
     *  if rideType is "Normal" and distance or time is less
     */
    @Test
    public void given_LessDistanceOrTime_ShouldReturnMinFare_ForNormalRide() {
        String rideType = "Normal";
        double distance = 0.2;
        double time = 2;
        double fare = cabInvoiceGenerator.calculateFare(rideType, distance, time);
        Assertions.assertEquals(5, fare);
    }
    /**
     *  test method should return minimum fare (20)
     *  if rideType is "Premium" and distance or time is less
     */
    @Test
    public void given_LessDistanceOrTime_ShouldReturnMinFare_ForPremiumRide() {
        String rideType = "Premium";
        double distance = 0.5;
        double time = 5;
        double fare = cabInvoiceGenerator.calculateFare(rideType, distance, time);
        Assertions.assertEquals(20, fare);
    }
    /**
     *  test method should return fare (10 * distance + 1 * time)
     *  if rideType is "Normal" and distance and time is not less
     */
    @Test
    public void given_DistanceAndTime_ShouldReturnTotalFare_ForNormalRide() {
        String rideType = "Normal";
        double distance = 9.0;
        double time = 20;
        double fare = cabInvoiceGenerator.calculateFare(rideType, distance, time);
        Assertions.assertEquals(110 , fare);
    }
    /**
     *  test method should return fare (15 * distance + 2 * time)
     *  if rideType is "Premium" and distance and time is not less
     */
    @Test
    public void given_DistanceAndTime_ShouldReturnTotalFare_ForPremiumRide() {
        String rideType = "Premium";
        double distance = 10.0;
        double time = 20;
        double fare = cabInvoiceGenerator.calculateFare(rideType, distance, time);
        Assertions.assertEquals(190 , fare);
    }
    /**
     *  test method should return invoice summary
     *  for userId = "user1" => (4, 225)
     *  for userId = "user2" => (3, 198)
     */
    @Test
    public void given_MultipleRidesOfUserId_ShouldReturnInvoiceSummary() {
        InvoiceSummary invoiceSummary = cabInvoiceGenerator.calculateTotalFare("user1");
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(4, 225);
        Assertions.assertEquals(expectedInvoiceSummary, invoiceSummary);
    }
}