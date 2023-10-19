package ejerciciosLogicaProgramacion;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int minhora = 60;
		int faltanteMin;
		
		Scanner escaner = new Scanner(System.in);
		String dia;
		System.out.println("Por favor, ingresa un día de la semana: lunes, martes, miércoles, jueves o viernes.");
		
		dia = escaner.nextLine();
		
		int hora;
		System.out.println("Por favor, ingresa una hora (formato 24 hr SIN minutos)");
		
		hora = escaner.nextInt();
		
		int minute;
		System.out.println("Por favor, ingresa los minutos (0-59 minutos)");
		
		minute = escaner.nextInt();
		
switch (dia) {
		
		case "lunes":
			faltanteMin = ((4) * 24 * minhora + (15 - hora) * minhora - minute);
			System.out.println("Faltan " + faltanteMin + " minutos para el fin de semana");
			break;

		case "martes":
			faltanteMin = ((4-1) * 24 * minhora + (15 - hora) * minhora - minute);
			System.out.println(" Faltan" + faltanteMin + " minutos para el fin de semana");
			break;
			
		case "miercoles":
			faltanteMin = ((4-2) * 24 * minhora + (15 - hora) * minhora - minute);
			System.out.println("Faltan " + faltanteMin + " minutos para el fin de semana");
			break;
			
		case "jueves":
			faltanteMin = ((4-3) * 24 * minhora + (15 - hora) * minhora - minute);
			System.out.println("Faltan " + faltanteMin + " minutos para el fin de semana");
			break;
			
		case "viernes":
			faltanteMin = ((4-4) * 24 * minhora + (15 - hora) * minhora - minute);
			System.out.println("Faltan " + faltanteMin + " minutos para el fin de semana");
			break;
			
		default:
			System.out.println("La opcion que ha ingresado NO es valida, ingrese alguna opción valida");
			break;
		
		}
		
	escaner.close();
	}

}
