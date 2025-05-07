package Esercizio2;

public class Sim {
    private final int numeroDiTelefono;
    private final String creditoDisponibile;
    private Chiamata[] chiamate;

    public Sim(int numeroDiTelefono, String creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaSim(){
        System.out.println("Il mio numero : " + numeroDiTelefono);
        System.out.println("Il mio credito : " + creditoDisponibile);
        System.out.println("Ultime chiamate : ");
        for (int i = 1; i < chiamate.length; i++) {
            System.out.println("Chiamata numero " + i);
            chiamate[i].stampaChiamata();
        }
    }
}
