package br.com.generation.Exercicio;

import java.util.Scanner;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class ExercicioDoWhile05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numTeclado, soma= 0;
				
		do {
			System.out.println("Digite um número do teclado: ");
			numTeclado = entrada.nextInt();
			soma += numTeclado;
		}
		while(numTeclado != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
			
			
		}
	}
