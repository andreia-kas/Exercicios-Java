package br.com.generation.OrientacaoObjetos;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao(42, "branco", 2587);
		
		System.out.println("Cor do avi�o: " + aviao1.getCor());
		System.out.println("Tamanho do avi�o: " + aviao1.getTamanho());
		System.out.println("N�mero de identifiica��o: " + aviao1.getNumeroIdentificacao());
		
		aviao1.voar();
		aviao1.pousar();

	}

}
