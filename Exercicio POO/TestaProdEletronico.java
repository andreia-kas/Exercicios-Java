package br.com.generation.OrientacaoObjetos;

public class TestaProdEletronico {

	public static void main(String[] args) {

		ProdEletronico celular = new ProdEletronico("Apple", "Branco", 2020, 3000);
		
		System.out.println("Marca do seu aparelho: " + celular.getMarca());
		System.out.println("Cor: " + celular.getCor());
		System.out.println("Ano de fabricação: " + celular.getAnoFabr());
		System.out.println("Valor do aparelho: " + celular.getValor());
		
		celular.ligar();
		celular.internet();
	}

}
