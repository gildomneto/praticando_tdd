import java.util.HashMap;
import java.util.Map;

public class ClienteController {

    private Map<String, Cliente> clientes;

    public ClienteController() {
        this.clientes = new HashMap<>();
    }

    public String criaCliente(Cliente cliente){
        this.clientes.put(cliente.getIdCliente(), cliente);
        return cliente.getIdCliente();
    }
}
