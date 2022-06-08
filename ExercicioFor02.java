package br.com.generation.Exercicio;

import java.util.Scanner;

/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class ExercicioFor02 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 
		 int par=0, impar=0;
		 
		 for(int n=1; n<=10; n++) {
			 
			 if(n%2==0) {
				 par++;
			 }
			 
			 if(n%2!=0) {
				 impar++;
			 }
			 
			 System.out.println("Digite um número de 0 a 10: ");
			 n= ler.nextInt();
		 }
		 
		 System.out.println("A quantidade de número pares é: " + par);
		 System.out.println("A quantidade de número impares é: " + impar);
		 
	}

}
