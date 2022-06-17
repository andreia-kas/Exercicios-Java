package br.com.generation.OrientacaoObjetos;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao(42, "branco", 2587);
		
		System.out.println("Cor do avião: " + aviao1.getCor());
		System.out.println("Tamanho do avião: " + aviao1.getTamanho());
		System.out.println("Número de identifiicação: " + aviao1.getNumeroIdentificacao());
		
		aviao1.voar();
		aviao1.pousar();

	}

}
