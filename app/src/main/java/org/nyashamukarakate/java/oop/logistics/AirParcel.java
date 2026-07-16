package org.nyashamukarakate.java.oop.logistics;

public class AirParcel extends Parcel {
    public AirParcel(String trackingId, double weight, String destination) {
        super(trackingId, weight, destination);
    }

    @Override
    public double calculateShippingCost() {
        return (getWeight() * 8.00) + 15.00;
    }

    @Override
    public void printTrackingUpdate() {
        System.out.println("  [AIR]    #" + getTrackingId() + " → " + getDestination());
    }
}
