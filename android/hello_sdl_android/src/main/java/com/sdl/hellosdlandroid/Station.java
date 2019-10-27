package com.sdl.hellosdlandroid;

/**
 * This class defines a gas station
 */
public class Station {

    private double gasPrice = 0.0;
    private double latitude = 0.0;
    private double longitude = 0.0;
    private double distanceFromUser = 0.0;

    public Station(int gasPrice, int latitude, int longitude, int distanceFromUser) {
        this.gasPrice = gasPrice;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distanceFromUser = distanceFromUser;
    }

    public double getGasPrice() {
        return gasPrice;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getDistanceFromUser() {
        return distanceFromUser;
    }

}
