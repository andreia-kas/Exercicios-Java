package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class LacoDecisao02 {
	/*
	 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
	 */

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, maiorNum=0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = entrada.nextInt();
		
		if(num1 < num2 && num2 < num3) {
			System.out.println(num1 + "-" + num2 + "-" + num3);
		}
			
			else if(num1 < num3) {
			System.out.println(num1 + "-" + num3 + "-" + num2);
		}
			else {
			System.out.println(num3 + "-" + num1 + "-" + num2);
		}
		
		if(num2 < num1 && num1 < num3) {
		System.out.println(num2 + num1 + num3);
		}
		else {
			System.out.println(num2 + "-" + num3 + "-" + num1);
		
		}
	}
}
