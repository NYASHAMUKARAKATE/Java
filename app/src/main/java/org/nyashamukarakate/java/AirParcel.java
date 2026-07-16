package org.nyashamukarakate.java;

public class AirParcel extends Parcel {
    public AirParcel(String trackingId, double weight, String destination) {
        super(trackingId, weight, destination);
    }

    @Override
    public double calculateShippingCost() {
        return (weight * 8.00) + 15.00;
    }

    @Override
    public void printTrackingUpdate() {
        System.out.println("Tracking update for air parcel: " + trackingId + " in flight to " + destination);
    }

}
