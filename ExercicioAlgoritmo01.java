package br.com.generation.aula01;

import java.util.Scanner;

public class ExercicioAlgoritmo01 {

	public static void main(String[] args) {
		
		int idade, ano, mes;
		
		System.out.println("Digite sua idade: ");
		Scanner leia = new Scanner (System.in);
		
		idade = leia.nextInt();
		
		ano = 365;
		mes = 12;
		
		System.out.println(idade + " anos");
		System.out.println(idade * ano + " dias desde o seu nascimento");
		
		

	}

}