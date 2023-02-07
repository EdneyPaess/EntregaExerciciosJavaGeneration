package Aula;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		float salarioBruno, adicionalNoturno, horasExtras, descontos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu Salário: ");
		salarioBruno =  leia.nextFloat();
		
		System.out.println("Digite seu Adicional Noturno: ");
		adicionalNoturno =  leia.nextFloat();
		
		System.out.println("Digite suas Horas Extras: ");
		horasExtras =  leia.nextFloat();
		
		System.out.println("Digite suas Descontos: ");
		descontos =  leia.nextFloat();
		
		float salarioLiquido= salarioBruno+adicionalNoturno+(horasExtras*5)-descontos;
		
		
		System.out.println("Seu salario liquido é de:: "+salarioLiquido);
	}

}
