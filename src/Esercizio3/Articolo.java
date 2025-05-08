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

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroPezziDisponibili() {
        return numeroPezziDisponibili;
    }

    public void setNumeroPezziDisponibili(int numeroPezziDisponibili) {
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }

    @Override
    public String toString() {
        return "Codice Articolo: " + codiceArticolo +
                ", Descrizione: " + descrizioneArticolo +
                ", Prezzo: " + prezzo +
                ", Numero pezzi disponibili: " + numeroPezziDisponibili;
    }
}
