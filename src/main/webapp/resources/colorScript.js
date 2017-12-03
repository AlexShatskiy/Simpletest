$(document).ready(function(){
    $("#green").click(function(){
        $(":button").removeClass('calculator__key__gray');
        $(":button").removeClass('calculator__key__yellow');
        $(".flag__1").css("background-color","#2edc20");
        $(".flag__2").css("background-color","white");
        $(".flag__3").css("background-color","white");


        $(":button").addClass("calculator__key__green");
        $(".text__yellow,.text__gray").addClass("text__green");
        $(".text__gray").removeClass('text__gray');
        $(".text__yellow").removeClass('text__yellow');
    });

    $("#yellow").click(function(){
        $(":button").removeClass('calculator__key__gray');
        $(":button").removeClass('calculator__key__green');
        $(".flag__1").css("background-color","white");
        $(".flag__2").css("background-color","#ffeb3b");
        $(".flag__3").css("background-color","white");


        $(":button").addClass("calculator__key__yellow");
        $(".text__green,.text__gray").addClass("text__yellow");
        $(".text__green").removeClass('text__green');
        $(".text__gray").removeClass('text__gray');
    });

    $("#gray").click(function(){
        $(":button").removeClass('calculator__key__green');
        $(":button").removeClass('calculator__key__yellow');
        $(".flag__1").css("background-color","white");
        $(".flag__2").css("background-color","white");
        $(".flag__3").css("background-color","#a2a2a2");


        $(":button").addClass("calculator__key__gray");
        $(".text__green,.text__yellow").addClass("text__gray");
        $(".text__green").removeClass('text__green');
        $(".text__yellow").removeClass('text__yellow');
    });


});