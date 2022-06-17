package br.com.generation.OrientacaoObjetos;

public class Cliente {

		//atributos
		private String nome;
		private int idade;
		private String estado;
		
		//metodos
		public void comprar() {
			System.out.println("Cliente est� comprando...");
		}
		
		public void pedirDesconto() {
			System.out.println("Me d� um desconto?...");
		}

			//encapsulamento, protege os dados do cliente
		public Cliente(String nome, int idade, String estado) {
			this.nome = nome;
			this.idade = idade;
			this.estado = estado;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
		
		
}
