package br.com.CarRental.Vehicle;

public class SportsUtilityVehicle extends Vehicle{
    public SportsUtilityVehicle(String licensePlate, String name) {
        this.licensePlate = licensePlate;
        this.name = name;
        this.availability = Availability.AVAILABLE;
        this.baseValue = 200;
    }
}