package br.com.generation.OrientacaoObjetos;

public class ProdEletronico {

		//atributos
		private String marca;
		private String cor;
		private int anoFabr;
		private double valor;
		
		//metodos
		
		public void ligar() {
			System.out.println("Seu produto está ligando...");
		}
		
		public void desligar() {
			System.out.println("Seu produto está desligando...");
		}
		
		public void internet() {
			System.out.println("Conectando na internet...");
		}

		public ProdEletronico(String marca, String cor, int anoFabr, double valor) {
			super();
			this.marca = marca;
			this.cor = cor;
			this.anoFabr = anoFabr;
			this.valor = valor;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getAnoFabr() {
			return anoFabr;
		}

		public void setAnoFabr(int anoFabr) {
			this.anoFabr = anoFabr;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		
		
}
