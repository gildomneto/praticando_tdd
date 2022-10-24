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
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Cargos getCargo() {
		return this.cargo;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
