package org.nyashamukarakate.java.oop.logistics;

public class GroundParcel extends Parcel {
    public GroundParcel(String trackingId, double weight, String destination) {
        super(trackingId, weight, destination);
    }

    @Override
    public double calculateShippingCost() {
        return (getWeight() * 3.50) + 5.00;
    }

    @Override
    public void printTrackingUpdate() {
        System.out.println("  [GROUND] #" + getTrackingId() + " → " + getDestination());
    }
}
