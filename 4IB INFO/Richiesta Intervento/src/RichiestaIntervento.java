public class RichiestaIntervento {
    private int numero;
    private String nomeCliente;
    private String tipoGuasto;
    private String descrizione;

    public RichiestaIntervento(int numero, String nomeCliente, String tipoGuasto, String descrizione) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.tipoGuasto = tipoGuasto;
        this.descrizione = descrizione;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getTipoGuasto() {
        return tipoGuasto;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTipoGuasto(String tipoGuasto) {
        this.tipoGuasto = tipoGuasto;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

public String toString() {
    return "Numero: " + numero + ", Nome cliente: " + nomeCliente + ", Tipo guasto: " + tipoGuasto + ", Descrizione: " + descrizione;
}
}
