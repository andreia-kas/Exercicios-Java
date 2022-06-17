package br.com.generation.OrientacaoObjetos;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario("Marta", "Supervisora", 1224);
		
		System.out.println("Nome do funcionário: " + func1.getNome());
		System.out.println("Cargo atual: " + func1.getCargo());
		System.out.println("Matricula: " + func1.getMatricula());
				
		func1.trabalhar();
		
		System.out.println();
	
		Funcionario func2 = new Funcionario("José", "Estoquista", 5874);
		System.out.println("Nome do funcionário: " + func2.getNome());
		System.out.println("Cargo atual: " + func2.getCargo());
		System.out.println("Matricula: " + func2.getMatricula());
		
		func2.folga();
		
	}
}
