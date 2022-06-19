package br.com.generation.heranca;

public class TestaGeral {

public static void main(String[] args) {
		
		Cavalo c1 = new Cavalo("Pé de Pano", 10, "Relincho", "Correr");
		
		c1.imprimir();
		
		Cachorro c2 = new Cachorro("Lola", 2, "Latido", "Correr");
		c2.imprimir();
		
		Preguica p1 = new Preguica ("Sid", 8, "Balido", "Dormir");
		p1.imprimir();
	}

}
