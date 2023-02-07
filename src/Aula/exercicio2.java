package Aula;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		float n1,n2,n3,n4;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite numero 1: ");
		n1 =  leia.nextFloat();
		System.out.println("Digite numero 2: ");
		n2 =  leia.nextFloat();
		System.out.println("Digite numero 3: ");
		n3 =  leia.nextFloat();
		System.out.println("Digite numero 4: ");
		n4 =  leia.nextFloat();
		
		float calcularMedia = (n1+n2+n3+n4)/4;

		System.out.printf("A média é: %.1f", calcularMedia);
	}

}
