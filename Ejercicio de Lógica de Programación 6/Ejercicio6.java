package ejerciciosLogicaProgramacion;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner palabra = new Scanner(System.in);
		String frase;
		System.out.println("Por favor, ingresa una palabra o frase");
		
		frase = palabra.nextLine();
		palabra.close();
		

	String fraseInv ="";
	
	for (int i = frase.length() - 1; i >= 0; i--) {
		fraseInv += frase.charAt(i);
	}
	
	System.out.println(fraseInv);


	}

}
