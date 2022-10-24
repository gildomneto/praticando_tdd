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
		funcionario.setSalario(5000);
		CalculadoraSalario calculadora = new CalculadoraSalario();
		assertEquals(4000, calculadora.calculaSalario(funcionario));
	}

}