package com.meetingroombooking.dao;

import com.meetingroombooking.model.Meeting;
import com.meetingroombooking.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MeetingDao {
    private final Connection connection;

    public MeetingDao(Connection connection) {
        this.connection = connection;
    }

    // Create a new meeting
    public void createMeeting(Meeting meeting) throws SQLException {
        String sql = "INSERT INTO meetings (title, organizer_id, meeting_date, start_time, end_time, meeting_type) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, meeting.getTitle());
            preparedStatement.setInt(2, meeting.getOrganizerId());
            preparedStatement.setDate(3, new java.sql.Date(meeting.getMeetingDate().getTime()));
            preparedStatement.setTime(4, meeting.getStartTime());
            preparedStatement.setTime(5, meeting.getEndTime());
            preparedStatement.setString(6, meeting.getMeetingType());

            preparedStatement.executeUpdate();
        }
    }

    // Retrieve a list of meetings
    public List<Meeting> getAllMeetings() throws SQLException {
        List<Meeting> meetings = new ArrayList<>();
        String sql = "SELECT * FROM meetings";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Meeting meeting = new Meeting();
                meeting.setId(resultSet.getInt("id"));
                meeting.setTitle(resultSet.getString("title"));
                meeting.setOrganizerId(resultSet.getInt("organizer_id"));
                meeting.setMeetingDate(resultSet.getDate("meeting_date"));
                meeting.setStartTime(resultSet.getTime("start_time"));
                meeting.setEndTime(resultSet.getTime("end_time"));
                meeting.setMeetingType(resultSet.getString("meeting_type"));

                meetings.add(meeting);
            }
        }

        return meetings;
    }
    
    // Add more methods as needed for updating and deleting meetings
}
