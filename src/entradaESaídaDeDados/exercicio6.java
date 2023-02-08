package entradaESaídaDeDados;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		float x1,y1,x2,y2, distancia1, distancia2, distanciaFinal, resultado;
		
	System.out.println("Digite o valor de x1: ");
	x1= entrada.nextFloat();
	System.out.println("Digite o valor de x1: ");
	y1= entrada.nextFloat();
	
	System.out.println("Digite o valor de x1: ");
	x2= entrada.nextFloat();
	System.out.println("Digite o valor de x1: ");
	y2= entrada.nextFloat();
	
	distancia1 = x2-x1;
	distancia2 = y2-y1;
	resultado = distancia1+distancia2;
	distanciaFinal = (float) Math.pow(resultado,0);
	
	System.out.println("A distancia entre os dois pontos é: "+distanciaFinal);
	
	

	}

}
