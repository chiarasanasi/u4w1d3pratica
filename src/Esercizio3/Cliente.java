package Esercizio3;

import java.time.LocalDate;

public class Cliente {
    private int codiceCliente;
    private String NomeCognome;
    private String email;
    private LocalDate data;

    public Cliente(int codiceCliente, String nomeCognome, String email, LocalDate data) {
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
