package br.com.generation.aula01;

import java.util.Scanner;

public class ExercicioAlgoritmo02 {

	public static void main(String[] args) {
		int ano, mes, dia;
		
		System.out.println("Digite a quantos dias voce nasceu: ");
		Scanner leia = new Scanner(System.in);
		
		dia = leia.nextInt();
		
		ano = 365;
		mes = 12;
		
		System.out.println(dia/ano + " anos");
		System.out.println(dia/mes + " meses");
		System.out.println(dia + " dias");
		
		

	}

}