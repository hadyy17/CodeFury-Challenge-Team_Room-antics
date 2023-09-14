CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255),
    Email VARCHAR(255),
    Phone VARCHAR(20),
    Role VARCHAR(50),
    Credits INT
);

CREATE TABLE MeetingRooms (
    RoomID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255),
    SeatingCapacity INT,
    Amenities TEXT
);

CREATE TABLE Meetings (
    MeetingID INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(255),
    Date DATE,
    StartTime TIME,
    Duration INT,
    MeetingType VARCHAR(50)
);

INSERT INTO Users (Name, Email, Phone, Role, Credits)
VALUES
    ('John Doe', 'john.doe@example.com', '123-456-7890', 'Admin', 2000),
    ('Jane Smith', 'jane.smith@example.com', '987-654-3210', 'Manager', 2000),
    ('Alice Johnson', 'alice.johnson@example.com', '555-555-5555', 'Member', 0),
    ('Bob Brown', 'bob.brown@example.com', '777-777-7777', 'Manager', 2000);


INSERT INTO MeetingRooms (Name, SeatingCapacity, Amenities)
VALUES
    ('Room A', 10, 'Projector, Wi-Fi, Whiteboard'),
    ('Room B', 20, 'Wi-Fi, Conference call facility, Water dispenser'),
    ('Room C', 8, 'Projector, Wi-Fi, Whiteboard, TV'),
    ('Room D', 15, 'Conference call facility, Water dispenser, Coffee machine');


INSERT INTO Meetings (Title, Date, StartTime, Duration, MeetingType)
VALUES
    ('Team Meeting', '2023-09-20', '09:00:00', 60, 'General'),
    ('Board Meeting', '2023-09-22', '14:30:00', 90, 'Board'),
    ('Training Session', '2023-09-25', '10:00:00', 120, 'Training'),
    ('Project Review', '2023-09-27', '15:00:00', 75, 'Project');