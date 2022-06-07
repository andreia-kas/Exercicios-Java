package br.com.generation.lacosdecisao;

import java.util.Scanner;

public class LacoDecisao01 {
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o 1° número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o 2° número: ");
		num2 = entrada.nextInt();
		System.out.println("Digite o 3° número: ");
		num3 = entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O 1° número é maior");
		}
		
		else if(num2 > num1 && num2 > num3) {
			System.out.println("O 2° numero é maior");
		}
		
		else {
			System.out.println("O 3° numero é maior");
		}
			}

}
