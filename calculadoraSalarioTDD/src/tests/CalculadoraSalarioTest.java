package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.CalculadoraSalario;
import main.Cargos;
import main.Funcionario;

class CalculadoraSalarioTest {
	
	private static Funcionario funcionario;
	
	@BeforeAll
	public static void init() {
		funcionario = new Funcionario("Digglet", "digglet@gmail.com", 10.000, Cargos.DESENVOLVEDOR);
	}

	@Test
	void CalculaSalarioDevMaior3000() {
		funcionario.setCargo(Cargos.DESENVOLVEDOR);
		funcionario.setSalario(5000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(4000, calculadora.calculaSalario(funcionario));
	}
	
	@Test
	void CalculaSalarioDevIgual3000() {
		funcionario.setCargo(Cargos.DESENVOLVEDOR);
		funcionario.setSalario(3000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(2400, calculadora.calculaSalario(funcionario));
	}
	
	@Test
	void CalculaSalarioDevMenor3000() {
		funcionario.setCargo(Cargos.DESENVOLVEDOR);
		funcionario.setSalario(2000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(1800, calculadora.calculaSalario(funcionario));
	}
	
	@Test
	void CalculaSalarioDBAMaior2000() {
		funcionario.setCargo(Cargos.DBA);
		funcionario.setSalario(5000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(3750, calculadora.calculaSalario(funcionario));
	}
	
	@Test
	void CalculaSalarioDBAIgual2000() {
		funcionario.setCargo(Cargos.DBA);
		funcionario.setSalario(2000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(1500, calculadora.calculaSalario(funcionario));
	}
	
	@Test
	void CalculaSalariDBAMenor2000() {
		funcionario.setCargo(Cargos.DBA);
		funcionario.setSalario(1000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(750, calculadora.calculaSalario(funcionario));
	}
	

}
