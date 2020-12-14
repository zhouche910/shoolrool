$(function(){
    $('.nav h2').on('click', function(){
        $(this).next('ul').toggleClass('active')
    })
})