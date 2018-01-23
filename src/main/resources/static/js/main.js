$(function() {
    function activateElement(selector, target) {
        $(selector).click(function() {
            $(target).toggleClass('activated');
        });
    }
    var navbarFix = new activateElement('#nav-mobile', '#navbar');
});