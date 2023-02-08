package entradaESaídaDeDados;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double segundos,horas, minutos, segundos2;
		
		System.out.println("Digite quantos segundos o evento irá durar: ");
		segundos = entrada.nextDouble();
		
		horas = segundos / 3600;
		minutos = (segundos%3600)/60;
		segundos2 = segundos % 60;
		
		System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos2 + " segundos.");
		

	}

}
