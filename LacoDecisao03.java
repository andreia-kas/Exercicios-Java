package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class LacoDecisao03 {
	/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
		 10-14 infantil
		 15-17 juvenil
		 18-25 adulto*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade < 15) {
			System.out.println("Voce se encontra na categoria: Infantil");
		}
		
		else if(idade >= 15 && idade < 18) {
			System.out.println("Voce se encontra na categoria: Juvenil");
		}
		
		else if (idade >= 18 && idade < 26) {
			System.out.println("Voce se encontra na categoria: Adulto");
		}
		
		else {
			System.out.println("Voce não se encaixa nas categorias disponiveis");
		}
	}

}
