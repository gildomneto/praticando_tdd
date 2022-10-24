package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Cargos;
import main.Funcionario;

class FuncionaroTest {
	
	private static Funcionario funcionario;

	@BeforeAll
	public static void init() {
		funcionario = new Funcionario("Digglet", "digglet@gmail.com", 10.000, Cargos.DESENVOLVEDOR);
	}
	
	@Test
	void FuncionarioGetNome() {
		 assertEquals("Digglet", funcionario.getNome());
	}
	
	@Test
	void FuncionarioGetEmail() {
		 assertEquals("digglet@gmail.com", funcionario.getEmail());
	}
	
	@Test
	void FuncionarioGetSalario() {
		 assertEquals(10.000, funcionario.getSalario());
	}
	
	@Test
	void FuncionarioGetCargo() {
		funcionario = new Funcionario("Digglet", "digglet@gmail.com", 10.000, Cargos.DESENVOLVEDOR);
		 assertEquals(Cargos.DESENVOLVEDOR, funcionario.getCargo());
	}
	
	@Test
	void FuncionarioSetSalario() {
		funcionario.setSalario(2000.50);
		assertEquals(2000.50, funcionario.getSalario());
	}
	
	@Test
	void FuncionarioSetCargo() {
		funcionario.setCargo(Cargos.TESTADOR);
		assertEquals(Cargos.TESTADOR, funcionario.getCargo());
	}

}
