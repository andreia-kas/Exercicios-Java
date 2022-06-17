package br.com.generation.OrientacaoObjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente pessoa1 = new Cliente("Julia", 20, "SP");
		
		System.out.println("Nome do cliente: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
		System.out.println("Estado: " + pessoa1.getEstado());
	
		pessoa1.comprar();
		pessoa1.pedirDesconto();
		
		
		

	}

}
