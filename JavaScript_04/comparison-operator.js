var pass = 50;
var score = 90;

var hasPassed = score >= pass;

var el = document.getElementById('anser');
el.textContent = 'Level passed:' + hasPassed;