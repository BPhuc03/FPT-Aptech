var ellist, addLink, newel, newText, counter, listItems;

ellist = document.getElementById( elementld: 'list');
addLink = document.querySelector( selectors: 'a');
counter = document.getElementById( elementld: 'counter');

function addItem(e) {
    e.preventDefault();
    newel = document.createElement('li');
    newText = document.createTextNode('New list item');
    newel.appendChild(newText);
    ellist.appendChild(newEl);
}
    function updateCount() {
        listItems = ellist.getElementsByTagName('li').length;
        counter.innerHTML = listItems;
    }
    addLink.addEventListener( type: 'click', addItem, options: false);
    ellist.addEventListener( type: 'DOMNodeInserted', updateCount, options: false);


