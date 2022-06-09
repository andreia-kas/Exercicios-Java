package br.com.generation.exercicios;

import java.util.Scanner;

/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class ExercicioVetor02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] dado = new int [10];
		int soma=0, maiorPontuacao=0, qtdPontuacao=0, media;
		
		System.out.println("***** DADO *****");
		System.out.println("--> Número da rodada <--");
		
		for(int i=0; i < 10; i++) {
			System.out.println((i+1) + "º Número: ");
			dado[i] = entrada.nextInt();
			
			while(dado[i] < 1 || dado[i] > 6) {
				System.out.println("Digite um número entre 1 e 6: ");
				dado[i] = entrada.nextInt();
			}
			
			if(dado[i] > maiorPontuacao) {
				maiorPontuacao = dado[i];
				qtdPontuacao = 0;
			}
			
			if(dado[i] == maiorPontuacao) {
				qtdPontuacao++;
			}
			
			soma += dado[i];
		}
		
		media = soma/10;
		
		for(int i=0; i <10; i++){
			System.out.println(dado[i] + " | ");
		}
			
			System.out.println("A média da pontuação foi: " + media);
			System.out.println("Maior pontuação: " + qtdPontuacao + " vezes");
	}

}
