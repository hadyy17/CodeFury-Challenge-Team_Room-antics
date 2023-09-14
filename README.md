# Automated Meeting Room Booking System

## Team Room-antics

Welcome to the Automated Meeting Room Booking System project repository by Team Room-antics. We are a team of 8 dedicated individuals, including a team lead, working together to develop and maintain this innovative meeting room booking solution.

## Project Overview

The Automated Meeting Room Booking System is designed to streamline and simplify the process of reserving meeting rooms within an organization. This system caters to employees with various roles, allowing them to effortlessly manage meeting rooms, search for suitable spaces, and book them according to their specific needs.

## Team Members

Meet the talented individuals behind Team Room-antics:

1. **Team Lead:** Hady Khan
2. Vrushali Nafadde
3. Yashmitha Poojary
4. Pragati Bisen
5. Ritika Malviya
6. Janavi Sridhar
7. Harsh Srivastava
8. Nikhil Gupta


## Project Scope

The Automated Meeting Room Booking System is designed to automate and simplify the process of booking meeting rooms within a company. It empowers employees to search for and reserve meeting rooms based on their specific requirements, enhancing the overall efficiency of meetings and room allocation.

## Description

The system is structured around three types of users, each with distinct roles:

### Users

1. **Admins**:
   - Create and configure meeting rooms.
   - Manage user roles and permissions.
   - Oversee the overall system.
   
2. **Managers**:
   - Search for and book meeting rooms.
   - Monitor and allocate meeting room expenses.
   - Organize and lead meetings.
   
3. **Members**:
   - Participate in meetings.
   
### Data Storage

The system relies on a robust database to store and manage crucial information. Key data categories include:

#### 1. Meeting Room Data
- **Unique Name**: A distinct identifier for each meeting room.
- **Seating Capacity**: The maximum number of individuals a room can accommodate.
- **Ratings**: Feedback-based ratings for each meeting room.
- **Amenities Available**:
  - Projector
  - Wi-Fi Connection
  - Conference call facility
  - Whiteboard
  - Water dispenser
  - TV
  - Coffee machine
- **Per Hour Cost (in Credits)**: The cost associated with booking a room per hour, determined by various factors.

#### 2. User Data
- **Unique ID**: A unique identifier for each user.
- **Name**: The user's full name.
- **Email**: User's email address for communication.
- **Phone**: User's contact number.
- **Credits**: The virtual currency used for booking rooms.
- **Role**: The user's role in the system (Admin/Manager/Member).

#### 3. Booking Information (Schedules)
- **Unique ID**: A unique identifier for each booking.
- **Meeting Room**: The room reserved for the meeting.
- **Date**: The date of the meeting.
- **Start Time**: The meeting's start time.
- **End Time**: The meeting's end time.
- **Booked by (User ID)**: The user who made the booking.

#### 4. Meeting Data
- **Unique ID**: A unique identifier for each meeting.
- **Title**: The title or name of the meeting.
- **Organized by (User ID)**: The user responsible for organizing the meeting.
- **Meeting Date**: The date of the meeting.
- **Start Time**: The meeting's start time.
- **End Time**: The meeting's end time.
- **Type (of Meeting)**: The categorization of the meeting (Classroom Training, Online Training, Conference Call, Business).
- **List of Members Attending the Meeting**: The participants in the meeting.

### Additional Information

- **Meeting Room Cost Calculation**: The per-hour cost of booking a meeting room is determined by the seating capacity and amenities provided. The cost structure is as follows:
  - Seating capacity <= 5: 0 credits
  - Seating capacity > 5 <= 10: 10 credits
  - Seating capacity > 10: 20 credits
  - Projector: 5 credits
  - Wi-Fi Connection: 10 credits
  - Conference call facility: 15 credits
  - Whiteboard: 5 credits
  - Water dispenser: 5 credits
  - TV: 10 credits
  - Coffee Machine: 10 credits
  - The per-hour cost is the sum of credits based on the provided amenities.

- **Manager Credits**: Users of the "Managers" role are allocated 2000 credits. They are required to pay the per-hour cost from these credits when booking a room. Manager credits are reset to 2000 points every Monday morning.

- **Mandatory Amenities**: Certain meeting types mandate specific amenities:
  - Classroom Training: Whiteboard and Projector
  - Online training: Wi-Fi and Projector
  - Conference call: Conference call facility
  - Business: Projector

## System Architecture

The system leverages a combination of databases, backend APIs, and a user-friendly frontend to provide an intuitive experience for room booking and management.

## Getting Started

To start using the Automated Meeting Room Booking System, please refer to our [Documentation](link-to-documentation.md). for detailed instructions on installation, configuration, and usage.

## Contribution Guidelines

We encourage contributions from the open-source community to improve and enhance the system. If you're interested in contributing, please review our [Contribution Guidelines](link-to-contributing.md).

## License

This project is licensed under the [MIT License](LICENSE.md).

## Contact Information

For any questions, concerns, or inquiries, please feel free to reach out to our team lead:

**Team Lead**: [Hady Khan](mailto:19cshad166@gmail.com)

Thank you for using the Automated Meeting Room Booking System by Team Room-antics! We hope this system significantly improves your meeting room booking experience.
