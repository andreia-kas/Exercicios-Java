package br.com.generation.Exercicio;

import java.util.Scanner;

/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

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
			 
			 System.out.println("Digite um n�mero de 0 a 10: ");
			 n= ler.nextInt();
		 }
		 
		 System.out.println("A quantidade de n�mero pares �: " + par);
		 System.out.println("A quantidade de n�mero impares �: " + impar);
		 
	}

}
