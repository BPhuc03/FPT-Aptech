var firstItem = document.getElementById('one');

var itemContent = firstItem.innerHTML;

firstItem.innerHTML = '<a href=\"://example.org\">' + itemContent + '</a>';
