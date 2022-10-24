import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class Testes {

    private ClienteController clienteController;

    @Test
    public void CriaClienteTest() throws ParseException {
        Cliente cliente = new Cliente("Gildo", "24/10/2022", "PB");

        assertEquals("Gildo", cliente.getNomeCliente());
    }

    @Test
    public void CriaFaturaTest() throws ParseException {
        String clientGuid = clienteController.criaCliente("Gildo", "24/10/2022", "PB");
    }
}