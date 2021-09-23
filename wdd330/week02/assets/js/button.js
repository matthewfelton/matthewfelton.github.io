function functionOne() {
    // collects number from input id inputOne
    let x = parseInt(document.getElementById("inputOne").value);
    // defines output value
    let output = 0;
   // validation of input
    if (isNaN(x)) {
        // alerts user of invalid input
        alert("Invalid input Please use a number");
    } else {
        // creates loop for i to = to inputOne value
        for (let i = 0; i <= x; i++) {
            // adds i current value you to output
            output += i;
        }
    }
    // take let output and places it to the div output.
    document.getElementById("outputOne").innerHTML = output;
}
function functionTwo() {
    // collects number from input id inputOne
    let x = parseInt(document.getElementById("inputOne").value);
    // collects number from input id inputTwo
    let y = parseInt(document.getElementById("inputTwo").value);
    // adds x and y together for output
    let output = x + y
    // take let output and places it to the div output.
    document.getElementById("outputTwo").innerHTML = output;
}