import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltroDeFaturas {

    private ClienteController clienteController;

    public FiltroDeFaturas(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public List<Fatura> filtraFaturas(Fatura[] faturas){
        List<Fatura> listaFiltrada = new ArrayList<>(Arrays.asList(faturas));
        return listaFiltrada;
    }
}
