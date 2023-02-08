package entradaESaídaDeDados;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		double a,b,c,r,s;
		
		System.out.println("Digite um numero inteiro: ");
		a = entrada.nextDouble();
		System.out.println("Digite o segundo numero inteiro: ");
		b = entrada.nextDouble();
		System.out.println("Digite o terceiro numero inteiro: ");
		c = entrada.nextDouble();
		
		r = Math.pow(a,b);
		s = Math.pow(b, c);
		
		System.out.println("A+B Elevado ao quadrado é: "+r+"e B+C elevado ao quadrado é: "+s);
		
		

	}

}
