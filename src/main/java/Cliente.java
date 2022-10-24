import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Cliente {

    private UUID idCliente;
    private String nomeCliente;
    private Date data;
    private String estado;


    public Cliente(String nomeCliente, String data, String estado) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.idCliente = UUID.randomUUID();
        this.nomeCliente = nomeCliente;
        this.data = simpleDateFormat.parse(data);
        this.estado = estado;
    }

    public String getIdCliente() {
        return this.idCliente.toString();
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public String getEstado() {
        return estado;
    }
}
