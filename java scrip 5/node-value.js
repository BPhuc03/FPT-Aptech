var itemTwo = document.getElementById('two');

var elText = itemTwo.firstChild.nodeValue;

elText = elText.replace('pine nuts');

itemTwo.firstChild.nodeValue = elText;