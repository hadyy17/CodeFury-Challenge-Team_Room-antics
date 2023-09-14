document.getElementById('loadData').addEventListener('click', function () {
    const fileInput = document.createElement('input');
    fileInput.type = 'file';

    fileInput.addEventListener('change', function() {
        const file = fileInput.files[0];
        const reader = new FileReader();

        reader.onload = function(event) {
            const content = event.target.result;
            const data = JSON.parse(content);

            const tableBody = document.querySelector('#dataTable tbody');
            tableBody.innerHTML = '';

            data.forEach(item => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.email}</td>
                    <td>${item.phone}</td>
                    <td>${item.role}</td>
                    <td>${item.credits}</td>
                `;
                tableBody.appendChild(row);
            });
        };

        reader.readAsText(file);
    });

    fileInput.click();
});
