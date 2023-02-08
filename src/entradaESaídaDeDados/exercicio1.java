package entradaESaídaDeDados;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		int anos, meses, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite quantoa anos você tem: ");
		anos = leia.nextInt();
		
		System.out.println("Digite quantos meses de vida você tem: ");
		meses = leia.nextInt();
		
		System.out.println("Após digitar quantos anos e meses de vida você tem, digite quantos dias de nascimento você tem: ");
		dias = leia.nextInt();
		
		int calculo= (anos * 365)+(meses*30) + dias;
		
		System.out.println("Sua idade em dias é: "+ calculo);
		

	}

}
