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
		return 0;
	}

}
