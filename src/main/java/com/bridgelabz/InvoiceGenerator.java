package com.bridgelabz;

public class InvoiceGenerator {
    private static final double MIN_COST_PER_KM = 10.0;
    private static final double MIN_FARE = 5;
    public final double COST_PER_TIME = 1.0;
    public double calculateFare(double distance, int time) {
        double totalFare = distance * MIN_COST_PER_KM + time * COST_PER_TIME;
        if (totalFare < MIN_FARE)
            return MIN_FARE;
        return totalFare;
    }
}
