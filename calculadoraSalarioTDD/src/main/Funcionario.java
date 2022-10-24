package main;

// Funcionario deve possuir nome, e-mail, salario-base e cargo
public class Funcionario {
	String nome;
	String email;
	double salario;
	Cargos cargo;
	
	public Funcionario(String nome, String email, double salario, Cargos cargo) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public String getNome() {
		throw new IllegalArgumentException("Not implemented");
	}
	
	public String getEmail() {
		throw new IllegalArgumentException("Not implemented");
	}
	
	public double getSalario() {
		throw new IllegalArgumentException("Not implemented");
	}
	
	public Cargos getCargo() {
		throw new IllegalArgumentException("Not implemented");
	}
	

}
