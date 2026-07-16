package org.nyashamukarakate.java;

public class LogisticsManager {
    public static void main(String[] args) {
        Parcel[] parcels = new Parcel[3];
        parcels[0] = new GroundParcel("1234", 10.0, "Mutare");
        parcels[1] = new AirParcel("5678", 20.0, "Harare");
        parcels[2] = new GroundParcel("91011", 30.0, "Bulawayo");

        double totalShippingCost = 0;
        for (int i = 0; i < parcels.length; i++) {
            parcels[i].printTrackingUpdate();
            System.out.printf("Cost: $%.2f\n", parcels[i].calculateShippingCost());
            totalShippingCost += parcels[i].calculateShippingCost();
        }
        System.out.println("Total shipping cost: " + totalShippingCost);

    }
}
