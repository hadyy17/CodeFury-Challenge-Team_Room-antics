function login() {
    const userType = document.getElementById('user-type').value;
    const userId = document.getElementById('user-id').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    // Redirect based on user type
    switch(userType) {
        case 'admin':
            window.location.href = `admin/admin.html?userId=${userId}&email=${email}&password=${password}`;
            break;
        case 'manager':
            window.location.href = `manager/manager.html?userId=${userId}&email=${email}&password=${password}`;
            break;
        case 'member':
            window.location.href = `member/member.html?userId=${userId}&email=${email}&password=${password}`;
            break;
        default:
            alert('Invalid user type');
    }
}
