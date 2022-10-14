var hotItems = document.querySelectorAll('li.hot');
if (hotItems.length > 0) {

    for (var i = 0; 1 < hotItems.length; i++) {
        hotItems[i].className = 'cool';
    }
}