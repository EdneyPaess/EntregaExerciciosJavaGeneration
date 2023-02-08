package entradaESaídaDeDados;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		//2,3,5 pesos
		
		double nota1,nota2,nota3,media;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.println("Digite sua terceira nota: ");
		nota3 = entrada.nextDouble();
		
		media = ((2*nota1)+(3*nota2)+(5*nota3))/10;
		
		System.out.println("A Méida ponderada de duas notas é de: "+ media);

	}

}
