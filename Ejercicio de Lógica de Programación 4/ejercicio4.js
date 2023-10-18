let fiboNumber = parseInt(prompt("Por favor ingrese un numero para mostrar sucesión de fibonacci"));

function fiboCalc(fiboNumber) {
    let fiboArray = [];
  
    if (fiboNumber >= 1) {
      fiboArray.push(0);
    }
    if (fiboNumber >= 2) {
        fiboArray.push(1);
    }
  
  for(let i = 2; i < fiboNumber; i++) {
    fiboArray[i] = fiboArray[i - 2] + fiboArray[i - 1];
  }
  return fiboArray;
  }

  console.log(fiboCalc(fiboNumber));