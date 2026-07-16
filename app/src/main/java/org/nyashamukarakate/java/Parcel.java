package org.nyashamukarakate.java;

public abstract class Parcel implements Trackable {
    String trackingId;
    double weight;
    String destination;

    public Parcel(String trackingId, double weight, String destination) {
        this.trackingId = trackingId;
        this.weight = weight;
        this.destination = destination;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive");
            this.weight = 1;
        }
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public abstract double calculateShippingCost();

}
