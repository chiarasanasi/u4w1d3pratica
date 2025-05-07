package Esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int numeroPezziDisponibili;

    public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String toString() {
        return "Codice Articolo: " + codiceArticolo +
                ", Descrizione: " + descrizioneArticolo +
                ", Prezzo: " + prezzo +
                ", Numero pezzi disponibili: " + numeroPezziDisponibili;
    }
}
