package com.meetingroombooking.factory;

import com.meetingroombooking.dao.UserDao;
import com.meetingroombooking.dao.MeetingRoomDao;
import com.meetingroombooking.dao.BookingInformationDao;
import com.meetingroombooking.dao.MeetingDao;
import com.meetingroombooking.util.DBUtil;

import java.sql.Connection;

public class DaoFactory {
    private static DaoFactory instance;
    private Connection connection;

    private DaoFactory() {
        connection = DBUtil.getConnection();
    }

    public static DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    public UserDao getUserDao() {
        return new UserDao(connection);
    }

    public MeetingRoomDao getMeetingRoomDao() {
        return new MeetingRoomDao(connection);
    }

    public BookingInformationDao getBookingInformationDao() {
        return new BookingInformationDao(connection);
    }

    public MeetingDao getMeetingDao() {
        return new MeetingDao(connection);
    }
}
