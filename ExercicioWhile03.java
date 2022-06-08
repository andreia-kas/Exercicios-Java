package br.com.generation.Exercicio;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class ExercicioWhile03 {

	public static void main(String[] args) {
		
		int idade = 0, menosVinteUm=0, maisCinquenta=0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			
			if(idade <21 && idade>0) {
				menosVinteUm++;
			}
			
			if(idade >50) {
				maisCinquenta++;
			}
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é: " + menosVinteUm + "\nO total de pessoas com mais de 50 é: " + maisCinquenta);

	}

}
