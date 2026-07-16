package org.nyashamukarakate.java.oop.logistics;

public class LogisticsManager {
    public static void run() {
        System.out.println("\n--- Logistics Manager Demo (Abstraction + Polymorphism) ---");
        Parcel[] parcels = {
            new GroundParcel("1234",  10.0, "Mutare"),
            new AirParcel(  "5678",  20.0, "Harare"),
            new GroundParcel("91011", 30.0, "Bulawayo")
        };

        double total = 0;
        for (Parcel p : parcels) {
            p.printTrackingUpdate();
            double cost = p.calculateShippingCost();
            System.out.printf("           Cost: $%.2f%n", cost);
            total += cost;
        }
        System.out.printf("  Total shipping cost: $%.2f%n", total);
    }
}
