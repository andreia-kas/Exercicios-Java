package br.com.generation.OrientacaoObjetos;
/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/

public class Funcionario {

	//atributo
	private String nome;
	private String cargo;
	private int matricula;
	
	
	//metodos
	public void trabalhar() {
		System.out.println("Funcionario está trabalhando...");
	}
	
	public void folga() {
		System.out.println("Hoje é folga do funcionário...");
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
