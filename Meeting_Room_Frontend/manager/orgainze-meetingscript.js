function bookMeeting() {
    const title = document.getElementById("title").value.trim();
    const meetingDate = document.getElementById("meeting-date").value;
    const startTime = document.getElementById("start-time").value;
    const duration = document.getElementById("duration").value;
    const meetingType = document.getElementById("meeting-type").value;
    const participants = document.getElementById("participants").value.trim().split(',').map(participant => participant.trim());
    const selectedMeetingRoom = document.getElementById("meeting-room").value;

    // Basic validation
    if (title === "" || !meetingDate || !startTime || duration === "" || meetingType === "" || participants.length === 0) {
        alert("Please fill in all required fields.");
        return;
    }

    // Validate meeting date and time
    const currentDate = new Date();
    const selectedDate = new Date(`${meetingDate}T${startTime}`);
    if (selectedDate <= currentDate) {
        alert("Meeting date and time should be later than the current date and time.");
        return;
    }

    // You can add further validation and booking logic here

    alert("Meeting booked successfully!");
}

function cancel() {
    // Redirect or perform other actions on cancel
    window.location.href = "manager.html"; // Redirect to the manager page
}
