package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

public class Collections {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int op;
		
		ArrayList <String> estoque = new ArrayList();
		
		System.out.println("--> Loja de Antiguidades <--");
		System.out.println("Veja as opções de escolha");
		
		do {
			System.out.println("1- Armazenar dados no estoque. ");
			System.out.println("2- Remover dados do estoque. ");
			System.out.println("3- Atualizar dados do estoque. ");
			System.out.println("4- Apresentar dados do estoque. ");
			System.out.println("0- Encerrar programa.");
			System.out.println("-------------------------------------");
			System.out.println("Escolha a opção que deseja: ");
			op = entrada.nextInt(); 
		
		switch(op) {
		
		case 1:
			entrada.nextLine();
			System.out.println("Qual produto será adicionado: ");
			String prod1 = entrada.nextLine();
			estoque.add(prod1);
			break;
		
		case 2:
			entrada.nextLine();
			System.out.println("Qual produto será removido: ");
			String prod2 = entrada.nextLine();
			
			if (prod2.contains(prod2)) {
			estoque.remove(prod2);
	}
			else {
				System.out.println("Esse produto não está cadastrado.");
				break;
}
		case 3:
			entrada.nextLine();
			System.out.println("Qual produto deseja atualizar?: ");
			String atualizar = entrada.nextLine();
			System.out.println("Escreva o produto que será substituido" + atualizar + ":");
			String novoProd = entrada.nextLine();
			
			if (estoque.contains(atualizar)){
				
				estoque.remove(atualizar);
				estoque.add(novoProd);
			}
			
			else {
				System.out.println("Esse produto não está cadastrado.");
			System.out.println("\n" + estoque);
			break;
}
			
		case 4:
			System.out.println("Estoque composto por: ");
			System.out.println(estoque);
			break;
			default:
			System.out.println("--> Finalizado <--");
	}
		}
		while(op != 0);
}
}