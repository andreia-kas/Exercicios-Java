package br.com.generation.OrientacaoObjetos;

public class Aviao {
	
	private double tamanho;
	private String cor;
	private int numeroIdentificacao;
	
	public void voar(){
		System.out.println("Avi�o est� voando...");
	}
	
	public void pousar() {
		System.out.println("Avi�o est� pronto para pousar...");
	}
	
	public void decolar() {
		System.out.println("Avi�o est� decolando...");
	}

	public Aviao(int tamanho, String cor, int numeroIdentificacao) {
		this.tamanho = tamanho;
		this.cor = cor;
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	
	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(int numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	
	
	
	

}
