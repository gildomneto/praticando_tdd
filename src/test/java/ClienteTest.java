import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    public void CriaClienteTest() throws ParseException {
        Cliente cliente = new Cliente("Gildo", "24/10/2022", "PB");

        assertEquals("Gildo", cliente.getNome());
    }
}