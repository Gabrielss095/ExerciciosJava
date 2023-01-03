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

public class Exercicio3While {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int menor21=0, maior50=0, idade=0;
		
		while(idade >= 0)
		{
			System.out.printf("Entre com a sua idade: ");
			idade = ler.nextInt();
			
			if(idade <21 && idade > 0)
			{
				menor21 += 1;
			}
			if(idade > 50)
			{
				maior50 += 1;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+menor21);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior50);
	}
}

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
		}while(n != 0);
		
		System.out.printf("A soma dos números positivos é: "+somaPositivos);
	}

}
