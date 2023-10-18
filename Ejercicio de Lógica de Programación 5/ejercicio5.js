let secretNum = 31;
let triesArray =[];
let randomNum;



do{
    randomNum = parseInt(prompt("Por favor ingrese un numero entre el 1 y el 100"));
    triesArray.push(randomNum);
    if(secretNum != randomNum){
    alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
    }
}
while(secretNum != randomNum)

alert("Felicidades, descubriste el número secreto: " + secretNum + ". Estos fueron tus intentos: " + triesArray);
//console.log("Estos fueron tus intentos: " + triesArray);