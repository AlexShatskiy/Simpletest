<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>

    <link rel="stylesheet" type="text/css" href="resources/styleCalc.css"/>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
    <script type="text/javascript" src="resources/calculatorScript.js"></script>


</head>
<body>
    <span class="gif__off">
        <img src="resources/Spinner.gif" width="70" height="70">
    </span>
<!-- CALCULATOR -->
<div class="calculator">

    <!-- CALCULATOR FORM -->
    <form class="calculator__form">
        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <input style="width:100%;" class="calculator__display" id="display" type="text" disabled placeholder="0"/>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <button type="button" value="mc" id="mc" class="calculator__key__gray"><span class="text__gray">MC</span>
            </button>
            <button type="button" value="m" id="m" class="calculator__key__gray"><span class="text__gray">M</span>
            </button>
            <button type="button" value="m+" id="mm" class="calculator__key__gray"><span class="text__gray">M+</span>
            </button>
            <button type="button" value="mr" id="mr" class="calculator__key__gray"><span class="text__gray">MR</span>
            </button>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <button type="button" value="7" id="7" class="calculator__key__gray"><span class="text__gray">7</span>
            </button>
            <button type="button" value="8" id="8" class="calculator__key__gray"><span class="text__gray">8</span>
            </button>
            <button type="button" value="9" id="9" class="calculator__key__gray"><span class="text__gray">9</span>
            </button>
            <button type="button" value="/" id="div" class="calculator__key__gray"><span class="text__gray">/</span>
            </button>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <button type="button" value="4" id="4" class="calculator__key__gray"><span class="text__gray">4</span>
            </button>
            <button type="button" value="5" id="5" class="calculator__key__gray"><span class="text__gray">5</span>
            </button>
            <button type="button" value="6" id="6" class="calculator__key__gray"><span class="text__gray">6</span>
            </button>
            <button type="button" value="*" id="inc" class="calculator__key__gray"><span class="text__gray">*</span>
            </button>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <button type="button" value="1" id="1" class="calculator__key__gray"><span class="text__gray">1</span>
            </button>
            <button type="button" value="2" id="2" class="calculator__key__gray"><span class="text__gray">2</span>
            </button>
            <button type="button" value="3" id="3" class="calculator__key__gray"><span class="text__gray">3</span>
            </button>
            <button type="button" value="-" id="min" class="calculator__key__gray"><span class="text__gray">-</span>
            </button>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <button type="button" value="0" id="0" class="calculator__key__gray calculator__key--equal"><span
                    class="text__gray">0</span></button>
            <button type="button" value="=" id="exe" class="calculator__key__gray"><span class="text__gray">=</span>
            </button>
            <button type="button" value="+" id="plu" class="calculator__key__gray"><span class="text__gray">+</span>
            </button>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <button type="button" id="green" class="calculator__color__green"></button>
            <button type="button" id="yellow" class="calculator__color__yellow"></button>
            <button type="button" id="gray" class="calculator__color__gray"></button>
            <button type="button" value="c" id="c" class="calculator__key__gray"><span class="text__gray">C</span>
            </button>
        </div>

        <!-- CALCULATOR ROW -->
        <div class="calculator__row">
            <div class="flag__1"></div>
            <div class="flag__2"></div>
            <div class="flag__3"></div>
            <div class="flag__4"></div>
        </div>
    </form>
</div>

</body>
</html>
