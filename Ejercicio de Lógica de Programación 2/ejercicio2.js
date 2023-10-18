
function tempCalc(){
let tempCelcius = parseFloat(prompt("Por favor ingrese la temperatura en grados Celsius"));

let tempFahren = tempCelcius * 1.8 + 32;
 console.log("La temperatura en grados Fahrenheit es de : " + tempFahren);
}

tempCalc();