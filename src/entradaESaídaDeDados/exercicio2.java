package entradaESaídaDeDados;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int dias,anos,meses,diasDeVida;
		
		System.out.println("De acordo com sua idade, quantos dias de vida você tem?: ");
		dias = entrada.nextInt();
		
		anos =dias/365;
		meses=(dias%365)/30;
		diasDeVida= (anos%365)%30;
		
		System.out.println("Você tem "+anos+" anos de idade "+meses+" meses e "+diasDeVida+" dias de vida ");
		
		
		
		
		
	}

}
