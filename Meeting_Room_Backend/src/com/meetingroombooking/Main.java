package com.meetingroombooking;

import com.meetingroombooking.dao.UserDao;
import com.meetingroombooking.dao.MeetingRoomDao;
import com.meetingroombooking.util.DBUtil;
import com.meetingroombooking.model.User;
import com.meetingroombooking.model.MeetingRoom;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Establish a database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Initialize DAOs
            UserDao userDao = new UserDao(connection);
            MeetingRoomDao roomDao = new MeetingRoomDao(connection);

            // Example: Creating a new user
            User newUser = new User(101, "John Doe", "john@example.com", "123456", "Manager", 2000);
            userDao.createUser(newUser);

            // Example: Creating a new meeting room
            MeetingRoom newRoom = new MeetingRoom(1, "Room A", 10, "Projector, Wi-Fi", 15);
            roomDao.createMeetingRoom(newRoom);

            // Example: Retrieving a list of users
            List<User> users = userDao.getAllUsers();
            for (User user : users) {
                System.out.println(user.getName() + " - " + user.getEmail());
            }

            // Example: Retrieving a list of meeting rooms
            List<MeetingRoom> rooms = roomDao.getAllMeetingRooms();
            for (MeetingRoom room : rooms) {
                System.out.println(room.getName() + " - Capacity: " + room.getSeatingCapacity());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
