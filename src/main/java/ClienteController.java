import java.util.HashMap;
import java.util.Map;

public class ClienteController {

    private Map<String, Cliente> clientes;

    public ClienteController(Map<String, Cliente> clientes) {
        this.clientes = new HashMap<>();
    }
}
