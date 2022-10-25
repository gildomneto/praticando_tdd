import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class Testes {

    private ClienteController clienteController;
    private FiltroDeFaturas filtroDeFaturas;

    @BeforeEach
    public void before(){
        this.clienteController = new ClienteController();
        this.filtroDeFaturas = new FiltroDeFaturas(clienteController);
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

        Fatura[] faturasASeremFiltradas = {new Fatura(500, "24/10/2022", idCliente)};

        assertEquals(0, filtroDeFaturas.filtraFaturas(faturasASeremFiltradas).size());

    }

    @Test
    public void FiltroDeFaturasEntre2000E2500() throws ParseException{
        String idCliente = clienteController.criaCliente(new Cliente("Gildo", "24/10/2022", "PB"));

        Fatura[] faturasASeremFiltradas = {new Fatura(2100, "24/10/2022", idCliente)};

        assertEquals(0, filtroDeFaturas.filtraFaturas(faturasASeremFiltradas).size());
    }
}