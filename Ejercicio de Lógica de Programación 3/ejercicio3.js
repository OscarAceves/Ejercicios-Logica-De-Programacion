
let simpleNum = parseFloat(prompt("Por favor ingrese un numero para mostrar su factorial"));

function factCalc(simpleNum) {

    for (let i = simpleNum - 1; i >= 1; i--) {
      simpleNum *= i;
    }
    return simpleNum;
  }
  
  console.log("El factorial es: " + factCalc(simpleNum));