package Aula;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
	
	double salario, abono, novoSalario;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite seu Salario: ");
	salario =  leia.nextDouble();
	
	System.out.println("Digite o abono: ");
	abono =  leia.nextDouble();

	novoSalario = salario + abono;
	
	System.out.println("\n Seu salário é:: "+ novoSalario);
	}

}
