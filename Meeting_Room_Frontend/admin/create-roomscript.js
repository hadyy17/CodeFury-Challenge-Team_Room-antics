function saveRoom() {
    const name = document.getElementById("name").value.trim();
    const capacity = document.getElementById("capacity").value.trim();
    const amenities = document.querySelectorAll('input[name="amenities"]:checked');
    const charges = document.getElementById("charges").value.trim();

    // Basic validation
    if (name === "" || capacity === "" || amenities.length < 2) {
        alert("Please fill in all required fields and select at least 2 amenities.");
        return;
    }

    // Calculate per hour charges (you can add your own calculation logic here)
    const perHourCharges = charges ? parseFloat(charges) : 0;

    // Generate a unique ID (you can add your own unique ID generation logic here)
    const uniqueId = generateUniqueId();

    // Create an object to represent the room
    const room = {
        id: uniqueId,
        name: name,
        capacity: parseInt(capacity),
        amenities: Array.from(amenities, (item) => item.value),
        charges: perHourCharges,
    };

    // You can save the room data or perform other actions here

    alert("Room created successfully!");
}

function cancel() {
    // Redirect or perform other actions on cancel
    window.location.href = "admin.html"; // Redirect to the admin page
}

function generateUniqueId() {
    // Generate a unique ID (you can implement your own logic)
    return Math.random().toString(36).substring(2) + Date.now().toString(36);
}
