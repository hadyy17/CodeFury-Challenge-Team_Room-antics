package com.meetingroombooking.model;

import java.util.Date;
import java.sql.Time;

public class Meeting {
    private int id;
    private String title;
    private int organizerId;
    private Date meetingDate;
    private Time startTime;
    private Time endTime;
    private String meetingType;

    // Constructors, getters, and setters

    public Meeting() {
        // Default constructor
    }

    public Meeting(int id, String title, int organizerId, Date meetingDate, Time startTime, Time endTime, String meetingType) {
        this.id = id;
        this.title = title;
        this.organizerId = organizerId;
        this.meetingDate = meetingDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingType = meetingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
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

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }
}
