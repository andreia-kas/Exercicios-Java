package br.com.generation.OrientacaoObjetos;
/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/

public class Funcionario {

	//atributo
	private String nome;
	private String cargo;
	private int matricula;
	
	
	//metodos
	public void trabalhar() {
		System.out.println("Funcionario est� trabalhando...");
	}
	
	public void folga() {
		System.out.println("Hoje � folga do funcion�rio...");
	}
	
	
	//encapsulamento
	public Funcionario(String nome, String cargo, int matricula) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
