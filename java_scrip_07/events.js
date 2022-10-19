$(function () {
    var ids = '';
    var $listItems = $('li');

    $listItems.on('mouseover click', function (){
        ids = this.id;
        $listItems.children('span').remove();
        $(this).append('<span class = "priority">' + ids + '</span>span>');
    });

    $listItems.on(',ouseout', function () {
        $(this).children('span').remove();
    });
});