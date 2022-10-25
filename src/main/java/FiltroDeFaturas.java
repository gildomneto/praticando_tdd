import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltroDeFaturas {

    private ClienteController clienteController;

    public FiltroDeFaturas(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public List<Fatura> filtraFaturas(Fatura[] faturas) {
        List<Fatura> listaFiltrada = new ArrayList<>(Arrays.asList(faturas));
        for (Fatura fatura : faturas) {
            Cliente client = this.clienteController.getCliente(fatura.getCliente());
            if (fatura.getValor() < 2000) {
                listaFiltrada.remove(fatura);
            }
            else if (fatura.getValor() >= 2000 && fatura.getValor()<2500){
                listaFiltrada.remove(fatura);
            }
            else if (fatura.getValor() >= 2500 && fatura.getValor() < 3000){
                listaFiltrada.remove(fatura);
            }

        }
        return listaFiltrada;
    }
}