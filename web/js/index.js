$(function(){
    $('.nav h2').on('click', function(){
        $(this).next('ul').toggleClass('active')
    })
})
// var deleteList=new Array();
// $.ajax({
//     type:"POST", //请求方式
//     url:"./testJson", //请求路径
//     cache: false,
//     data:{//传参
//         "name":"zhang3",
//         "deleteList":deleteList,
//     },
//     dataType: 'json',   //返回值类型
//     success:function(json){
//         alert(json[0].username+" " + json[0].password);    //弹出返回过来的List对象
//         alert(json[1].username+" " + json[1].password);    //弹出返回过来的List对象
//     }
// });