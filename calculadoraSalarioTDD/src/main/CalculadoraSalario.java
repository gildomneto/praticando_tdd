package main;

public class CalculadoraSalario {

	public double calculaSalario(Funcionario funcionario) {

		if (funcionario.getCargo() == Cargos.DESENVOLVEDOR) {
			if(funcionario.getSalario() >= 3000) {
				return funcionario.getSalario() * 0.80;
			} else {
				return funcionario.getSalario() * 0.90;
			}
		} 
		else if (funcionario.getCargo() == Cargos.DBA) {
			if(funcionario.getSalario() >= 2000) {
				return funcionario.getSalario() * 0.75;
			} else {
				return funcionario.getSalario() * 0.85;
			}
		}
		else if (funcionario.getCargo() == Cargos.TESTADOR) {
			if(funcionario.getSalario() >= 2000) {
				return funcionario.getSalario() * 0.75;
			} else {
				return funcionario.getSalario() * 0.85;
			}
		}
		return 0;
	}

}
