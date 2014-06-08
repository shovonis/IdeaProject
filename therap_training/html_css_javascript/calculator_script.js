/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/20/14
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */

function buttonClicked(buttonValue) {
    // alert(buttonValue);
    switch (buttonValue) {
        case "0":
            displayToMonitor(buttonValue);
            break;
        case "1":
            displayToMonitor(buttonValue);
            break;
        case "2":
            displayToMonitor(buttonValue);
            break;
        case "3":
            displayToMonitor(buttonValue);
            break;

        case "4":
            displayToMonitor(buttonValue);
            break;
        case "5":
            displayToMonitor(buttonValue);
            break;
        case "6":
            displayToMonitor(buttonValue);
            break;
        case "7":
            displayToMonitor(buttonValue);
            break;

        case "8":
            displayToMonitor(buttonValue);
            break;
        case "9":
            displayToMonitor(buttonValue);
            break;

        case "back":
            removeLastFromMonitor();
            break;
        case "CE":
            clearScreen();
            break;
        case "x2":
            displayToMonitor("^");
            break;
        case "root":
            displayToMonitor('\u221A');
            break;
        case "(":
            displayToMonitor(buttonValue);
            break;
        case ")":
            displayToMonitor(buttonValue);
            break;
        case "+":
            displayToMonitor(buttonValue);
            break;
        case "-":
            displayToMonitor(buttonValue);
            break;
        case "*":
            displayToMonitor(buttonValue);
            break;
        case "/":
            displayToMonitor(buttonValue);
            break;
        case "%":
            displayToMonitor(buttonValue);
            break;
        case ".":
            displayToMonitor(buttonValue);
            break;
        case "=":
            findResult();
            break;
        default :
            break;
    }
}

function displayToMonitor(value) {
    var input = document.getElementById("monitor").value;
    if (value == '\u221A') {
        value = value + "(";
    }
    document.getElementById("monitor").value = input + value;
}
function removeLastFromMonitor() {
    var input = document.getElementById("monitor").value;
    var string = input.replace(/(\s+)?.$/, '');
    document.getElementById("monitor").value = string;
}

function clearScreen() {
    document.getElementById("monitor").value = "";
}
function findResult() {
    var expression = document.getElementById("monitor").value;

    var e = replaceAll(expression, "\u221A", "Math.sqrt");
    if (e.contains("%")) {
        e = e.replace(new RegExp(/%/g), "/100");
    }
    if (e.contains("^")) {
        var powerMatchedExpression = e.match(/(\d+\^\d+)+/g);
        var spitedResult = powerMatchedExpression.toString().split(/[\^,]/);

        for (var i = 0; i < spitedResult.length; i += 2) {
            e = e.replace(/(\d+\^\d+)/, "Math.pow(" + spitedResult[i] + "," + spitedResult[i + 1] + ")");
        }

    }
    document.getElementById("monitor").value = eval(e);
}

function replaceAll(oldStr, removeStr, replaceStr, caseSenitivity) {
    if (caseSenitivity == 1) {
        cs = "g";
    } else {
        cs = "gi";
    }
    var myPattern = new RegExp(removeStr, cs);
    newStr = oldStr.replace(myPattern, replaceStr);
    return newStr;
}

