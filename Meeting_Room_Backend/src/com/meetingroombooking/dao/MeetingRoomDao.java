package com.meetingroombooking.dao;

import com.meetingroombooking.model.MeetingRoom;
import com.meetingroombooking.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MeetingRoomDao {
    private final Connection connection;

    public MeetingRoomDao(Connection connection) {
        this.connection = connection;
    }

    // Create a new meeting room
    public void createMeetingRoom(MeetingRoom room) throws SQLException {
        String sql = "INSERT INTO meeting_rooms (name, seating_capacity, amenities, per_hour_cost) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, room.getName());
            preparedStatement.setInt(2, room.getSeatingCapacity());
            preparedStatement.setString(3, room.getAmenities());
            preparedStatement.setInt(4, room.getPerHourCost());

            preparedStatement.executeUpdate();
        }
    }

    // Retrieve a list of meeting rooms
    public List<MeetingRoom> getAllMeetingRooms() throws SQLException {
        List<MeetingRoom> meetingRooms = new ArrayList<>();
        String sql = "SELECT * FROM meeting_rooms";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                MeetingRoom room = new MeetingRoom();
                room.setId(resultSet.getInt("id"));
                room.setName(resultSet.getString("name"));
                room.setSeatingCapacity(resultSet.getInt("seating_capacity"));
                room.setAmenities(resultSet.getString("amenities"));
                room.setPerHourCost(resultSet.getInt("per_hour_cost"));

                meetingRooms.add(room);
            }
        }

        return meetingRooms;
    }
    
    // Add more methods as needed for updating and deleting meeting rooms
}
