package org.nyashamukarakate.java;

public class GroundParcel extends Parcel {
    public GroundParcel(String trackingId, double weight, String destination) {
        super(trackingId, weight, destination);
    }

    public double calculateShippingCost() {
        return weight * 2.50;
    }

    public void printTrackingUpdate() {
        System.out.println("Tracking update for ground parcel: " + trackingId + " to " + destination);
    }
}
