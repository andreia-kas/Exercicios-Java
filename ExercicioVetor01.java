package br.com.generation.exercicios;

import java.util.Scanner;

/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

public class ExercicioVetor01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] vetor = new double [5];
		
		double maiorNota = 0;
		
		for(int i=0; i < 5; i++) {
			System.out.println("Informe a " + i+1 + " ª nota do aluno: ");
			vetor[i] = entrada.nextDouble();
			
			if (vetor[i] > maiorNota) {
				maiorNota = vetor[i];
			}
			
		}
		
		System.out.println("As notas foram: ");
		for (int i=0; i < 5; i++) {
			System.out.println(vetor[i] + " | ");
		}
		
		System.out.println("A maior nota foi: " + maiorNota);
		
		}

}
