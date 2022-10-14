var list = document.getElementsByTagName('ul')[0];

var newItemLast = document.createElement('li');
var newTextLast = document.createTextNode('cream');
newItemLast.appendChild(newItemLast);
list.appendChild(newItemLast);

var newItemFirst = document.createElement('li');
var newTextFirst = document.createTextNode('kale');
newItemFirst.appendChild(newTextFirst);
list.insertBefore(newTextFirst, list.firstChild);

var listItem = document.querySelectorAll('li');

var i;
for (i = 0; i < listItem.length; i++);{
    listItem[i].className = 'cool';
}
var heading = document.querySelector(''h2);
var headingText = heading.firstChild.nodeValue;
var totalItems = listItem.length;
var newHeading = headingText + '<span>' + totalItems + '</span>';
heading.innerHTML = newHeading;