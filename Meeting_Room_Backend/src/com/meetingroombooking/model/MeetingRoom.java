package com.meetingroombooking.model;

public class MeetingRoom {
    private int id;
    private String name;
    private int seatingCapacity;
    private String amenities;
    private int perHourCost;

    // Constructors, getters, and setters

    public MeetingRoom() {
        // Default constructor
    }

    public MeetingRoom(int id, String name, int seatingCapacity, String amenities, int perHourCost) {
        this.id = id;
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.amenities = amenities;
        this.perHourCost = perHourCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public int getPerHourCost() {
        return perHourCost;
    }

    public void setPerHourCost(int perHourCost) {
        this.perHourCost = perHourCost;
    }
}
