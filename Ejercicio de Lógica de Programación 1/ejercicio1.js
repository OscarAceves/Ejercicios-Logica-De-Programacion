
let numInt1;
let numInt2;
let numInt3;


    numInt1 = parseInt(prompt("Por favor agregue un numero: "));
    numInt2 = parseInt(prompt("Por favor agregue un numero: "));
    numInt3 = parseInt(prompt("Por favor agregue un numero: "));
    

if(numInt1 === numInt2 && numInt2 === numInt3) {
    console.log("Todos los números son iguales");
  }else{

  let numIntArray = [numInt1, numInt2, numInt3];

    // Números de mayor a menor
    let numOrderA = numIntArray.slice().sort(function (a, b){
        return b - a;
    });
  
    
//Se imprime areglo ordenado
console.log(numOrderA);
console.log(numOrderA.reverse());

  }