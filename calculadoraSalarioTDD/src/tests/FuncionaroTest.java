package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Cargos;
import main.Funcionario;

class FuncionaroTest {
	
	private static Funcionario funcionario;

	@BeforeAll
	public static void init() {
		funcionario = new Funcionario("Digglet", "digglet@gmail.com", 10.000, Cargos.Desenvolvedor);
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
		 assertEquals(Cargos.Desenvolvedor, funcionario.getCargo());
	}

}
