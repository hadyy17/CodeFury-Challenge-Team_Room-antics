package com.meetingroombooking.model;

import java.util.Date;
import java.sql.Time;

public class BookingInformation {
    private int id;
    private int roomId;
    private Date meetingDate;
    private Time startTime;
    private Time endTime;
    private int bookedByUserId;

    // Constructors, getters, and setters

    public BookingInformation() {
        // Default constructor
    }

    public BookingInformation(int id, int roomId, Date meetingDate, Time startTime, Time endTime, int bookedByUserId) {
        this.id = id;
        this.roomId = roomId;
        this.meetingDate = meetingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bookedByUserId = bookedByUserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public int getBookedByUserId() {
        return bookedByUserId;
    }

    public void setBookedByUserId(int bookedByUserId) {
        this.bookedByUserId = bookedByUserId;
    }
}
