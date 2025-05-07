package Esercizio3;

public class Cliente {
    private int codiceCliente;
    private String NomeCognome;
    private String email;
    private String data;

    public Cliente(int codiceCliente, String nomeCognome, String email, String data) {
        this.codiceCliente = codiceCliente;
        NomeCognome = nomeCognome;
        this.email = email;
        this.data = data;
    }

    public String toString() {
        return "Codice Cliente: " + codiceCliente +
                ", Nome: " + NomeCognome +
                ", Email: " + email +
                ", Data iscrizione: " + data;
    }
}
