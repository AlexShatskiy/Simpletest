$(document).ready(function(){
    //Close page
    $(window).bind("beforeunload", function() {
        $.ajax({
            type: "GET",
            url: "execute",
            data: {
                operation: "c",
            },

            success: function (html) {
                $("#display").val(html);
            },
            error: function(e) {
                console.log("Error:" + e);
            }
        });
    });
    //Calculator service
    var memor="";
    $("#1,#2,#3,#4,#5,#6,#7,#8,#9").click(function(){
        var tach=$(this).attr('value');

        if(memor==0){
            memor=tach;
        } else {
            memor=memor+tach;
        }

        $("#display").val(memor);
    });
    $("#0").click(function(){
        var tach=$(this).attr('value');
        if(memor=== ""||memor==0){
            memor=0;
        } else {
            memor=memor+tach;
        }


        $("#display").val(memor);
    });
    $("#mc,#m,#mm,#mr,#div,#inc,#min,#plu,#c,#exe").click(function(){
        //Spinner animation
        $(".gif__off").addClass("gif__on");
        $(".gif__off").removeClass('gif__off');
        //service
        var operation=$(this).attr('value');
        $.ajax({
            type: "GET",
            url: "setOperand",
            data: {
                arg: memor,
            },

            success: function (html) {
                memor="";
            },
            error: function(e) {
                console.log("Error:" + e);
                memor="";
            }
        });
        $.ajax({
            type: "GET",
            url: "execute",
            data: {
                operation: operation,
            },

            success: function (html) {
                $("#display").val(html);
                //Spinner animation
                $(".gif__on").addClass("gif__off");
                $(".gif__on").removeClass('gif__on');
            },
            error: function(e) {
                console.log("Error:" + e);
            }
        });
    });

//chenge style
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
     //set position
    var offset = $(".calculator").offset();
    var leftC=offset.left+250;
    var topC=offset.top + 10;
    $(".gif__on").offset({top:topC, left:leftC});
    $(".gif__off").offset({top:topC, left:leftC});
});