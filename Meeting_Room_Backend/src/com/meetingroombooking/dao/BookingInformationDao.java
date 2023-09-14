package com.meetingroombooking.dao;

import com.meetingroombooking.model.BookingInformation;
import com.meetingroombooking.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookingInformationDao {
    private final Connection connection;

    public BookingInformationDao(Connection connection) {
        this.connection = connection;
    }

    // Create a new booking information
    public void createBookingInformation(BookingInformation bookingInfo) throws SQLException {
        String sql = "INSERT INTO booking_information (room_id, meeting_date, start_time, end_time, booked_by_user_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, bookingInfo.getRoomId());
            preparedStatement.setDate(2, new java.sql.Date(bookingInfo.getMeetingDate().getTime()));
            preparedStatement.setTime(3, bookingInfo.getStartTime());
            preparedStatement.setTime(4, bookingInfo.getEndTime());
            preparedStatement.setInt(5, bookingInfo.getBookedByUserId());

            preparedStatement.executeUpdate();
        }
    }

    // Retrieve a list of booking information
    public List<BookingInformation> getAllBookingInformation() throws SQLException {
        List<BookingInformation> bookingInformationList = new ArrayList<>();
        String sql = "SELECT * FROM booking_information";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                BookingInformation bookingInfo = new BookingInformation();
                bookingInfo.setId(resultSet.getInt("id"));
                bookingInfo.setRoomId(resultSet.getInt("room_id"));
                bookingInfo.setMeetingDate(resultSet.getDate("meeting_date"));
                bookingInfo.setStartTime(resultSet.getTime("start_time"));
                bookingInfo.setEndTime(resultSet.getTime("end_time"));
                bookingInfo.setBookedByUserId(resultSet.getInt("booked_by_user_id"));

                bookingInformationList.add(bookingInfo);
            }
        }

        return bookingInformationList;
    }
    
    // Add more methods as needed for updating and deleting booking information
}
