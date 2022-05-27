package com.bridgelabz;

public class InvoiceGenerator {
    private static final double MIN_COST_PER_KM = 10.0;
    public final double COST_PER_TIME = 1.0;
    public double calculateFare(double distance, int time) {
        double fare = distance * MIN_COST_PER_KM + time * COST_PER_TIME;
        return fare;
    }
}
