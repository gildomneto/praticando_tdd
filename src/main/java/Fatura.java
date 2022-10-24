import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Fatura {

    private String codigo;
    private float valor;
    private Date data;
    private String cliente;

    public Fatura(float valor, String data, String cliente) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.codigo = UUID.randomUUID().toString();
        this.valor = valor;
        this.data = simpleDateFormat.parse(data);
        this.cliente = cliente;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public float getValor() {
        return this.valor;
    }

    public Date getData() {
        return data;
    }

    public String getCliente() {
        return this.cliente;
    }
}
