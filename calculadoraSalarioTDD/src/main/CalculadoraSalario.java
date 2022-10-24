package main;

public class CalculadoraSalario {

	public double calculaSalario(Funcionario funcionario) {
		
		Cargos cargo = funcionario.getCargo();
		double salario = funcionario.getSalario();
		
		switch(cargo) {
		
		case DESENVOLVEDOR:
			return salario >= 3000 ? salario * 0.8 : salario * 0.9;
		case DBA:
		case TESTADOR:
			return salario >= 2000 ? salario * 0.75 : salario * 0.85;
		case GERENTE:
			return salario >= 5000 ? salario * 0.7 : salario * 0.8;
		default:
			return salario;
		
		} 
	}
}
