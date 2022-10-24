import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class Testes {

    private ClienteController clienteController;

    @BeforeEach
    public void before(){
        this.clienteController = new ClienteController();
    }

    @Test
    public void CriaClienteTest() throws ParseException {
        Cliente cliente = new Cliente("Gildo", "24/10/2022", "PB");

        assertEquals("Gildo", cliente.getNomeCliente());
    }

    @Test
    public void CriaFaturaTest() throws ParseException {
        String clientGuid = clienteController.criaCliente(new Cliente("Gildo", "24/10/2022", "PB"));
        Fatura fatura = new Fatura();
    }
}