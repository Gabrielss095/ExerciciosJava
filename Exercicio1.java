package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.printf("Entre com um número: ");
		a = ler.nextInt();
		
		if(a % 2 == 0 && a >= 0)
		{
			System.out.printf("O número %d é par e é positivo", a);
		}
		if(a % 2 == 0 && a <0)
		{
			System.out.printf("O número %d é par e é negativo", a);
		}
		if(a % 2 != 0 && a >=0)
		{
			System.out.printf("O número %d é impar e é positivo", a);
		}
		if(a % 2 != 0 && a <0)
		{
			System.out.printf("O número %d é impar e é negativo", a);
		}
	}
}
