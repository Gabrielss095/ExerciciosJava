package PacoteJava;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, somaPositivos=0;
		do
		{
			System.out.printf("Digite um número: ");
			n = ler.nextInt();
			if(n > 0)
			{
				somaPositivos += n;
			}
		}
		while(n != 0);
		
		System.out.printf("A soma dos números positivos é: "+somaPositivos);
	}

}
