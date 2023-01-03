package PacoteJava;

import java.util.Scanner;

public class Exercicio2For {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int n, x, contImpar=0, contPar=0;
		
		for(x=1;x<=10;x++)
			{
				System.out.printf("Entre com o "+x+"º número: ");
				n = ler.nextInt();
				if(n % 2 == 0)
				{
					contPar += 1;
				}
				else
				{
					contImpar += 1;
				}
			}
		System.out.printf("\nTotal de números pares "+ contPar);
		System.out.printf("\nTotal de números impares "+ contImpar);
	}
}
