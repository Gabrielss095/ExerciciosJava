package PacoteJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.printf("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if(idade <= 16)
		{
			System.out.println("A pessoa não está apta a votar");
		}
		
		if(idade >= 16 && idade < 18)
		{
			System.out.println("\nA pessoa está apta a votar e o voto é facultativo");
		}
		if(idade >= 18 && idade < 65)
		{
			System.out.println("\nA pessoa está apta a votar e o voto é obrigatório");
		}
		if(idade >= 65)
		{
			System.out.println("\nA pessoa está apta a votar e o voto é facultativo");
		}
	}
}
