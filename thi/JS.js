function checkUsername() {
    var elMsg = document.getElementById('feedback');
    if (this.value.length > 15) {
        elMsg.textContent = 'Username must be 15 characters of more';
    } else {
        elMsg.textContent = '';
    }
}
function  checkEmail() {
    var email = document.getElementById('email').value;
    var elMsg = document.getElementById('feedback1');
    var mailformat = /^[A-Za-z0-9_.]{6,32}@([a-zA-Z0-9]{2,12})(.[a-zA-Z]{2,12})+$/;
    if (!mailformat.test(email)) {
        elMsg.textContent = 'Email Khong Hop Le';
    } else {
        elMsg.textContent = '';
    }
}


var elUsername = document.getElementById('username');
elUsername.addEventListener('blur',checkUsername,'false');

var elEmail = document.getElementById('email');
elEmail.addEventListener('blur',checkEmail, 'false');