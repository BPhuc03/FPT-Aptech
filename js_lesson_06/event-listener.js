function checkUsername() {
    var elMsg = document.getElementById('feedback');
    if (this.value.length < 5) {
        elMsg.textContent = 'Usernmae must be 5 characters of more';
    } else {
        elMsg.textContent = '';
    }
}
var elUsername = document.getElementById('username');
elUsername.addEventListener('blur',checkUsername,'false');