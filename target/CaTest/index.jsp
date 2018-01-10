<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>

    <link rel="stylesheet" type="text/css" href="resources/styleCalc.css"/>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){

            $("#mc").click(function(){

                //service
                var operation=$(this).attr('value');

                $.ajax({
                    url : 'wrap',
                    type: 'GET',
                    dataType: 'json',
                    contentType: 'application/json',
                    mimeType: 'application/json',
                    data : ({
                        text: "ttt"
                    }),
                    success: function (data) {

alert(data);
                        $("#result_text").text(data);
                    }
                });
            });
        });

    </script>


</head>
<body>
<button type="button" value="mc" id="mc" class="calculator__key__gray"><span class="text__gray">MC</span></button>
<p id="result_text"></p>
</body>
</html>
