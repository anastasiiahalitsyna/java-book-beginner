package com.anastasiia.section7;

public class Truck extends Vehicle {
    private int carGoCap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        carGoCap = c;
    }

    public int getCarGoCap() {
        return carGoCap;
    }

    public void setCarGoCap(int carGoCap) {
        this.carGoCap = carGoCap;
    }
}

class Vehicle {
    private int passengers;
    private int fuelCap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelCap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelCap;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}

class TruckDemo {

    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);
        System.out.println("Semi can curry " + semi.getCarGoCap() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel. \n");

        gallons = pickup.fuelNeeded(dist);
        System.out.println("Pickup can curry " + pickup.getCarGoCap() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel. \n");
    }
}
