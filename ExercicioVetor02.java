package br.com.generation.exercicios;

import java.util.Scanner;

/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

public class ExercicioVetor02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int [] dado = new int [10];
		int soma=0, maiorPontuacao=0, qtdPontuacao=0, media;
		
		System.out.println("***** DADO *****");
		System.out.println("--> N�mero da rodada <--");
		
		for(int i=0; i < 10; i++) {
			System.out.println((i+1) + "� N�mero: ");
			dado[i] = entrada.nextInt();
			
			while(dado[i] < 1 || dado[i] > 6) {
				System.out.println("Digite um n�mero entre 1 e 6: ");
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
			
			System.out.println("A m�dia da pontua��o foi: " + media);
			System.out.println("Maior pontua��o: " + qtdPontuacao + " vezes");
	}

}
