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
        String idCliente = clienteController.criaCliente(new Cliente("Gildo", "24/10/2022", "PB"));
        Fatura fatura = new Fatura(500, "24/10/2022", idCliente);

        assertEquals(idCliente, fatura.getCliente());
    }

    @Test
    public void FiltroDeFaturasMenoreQue2000() throws ParseException{
        String idCliente = clienteController.criaCliente(new Cliente("Gildo", "24/10/2022", "PB"));

        FiltroDeFaturas filtroDeFaturas = new FiltroDeFaturas();
    }
}