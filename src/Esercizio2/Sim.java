package Esercizio2;

public class Sim {
    private  String numeroDiTelefono;
    private  double creditoDisponibile;
    private Chiamata[] chiamate;

    //costruttore
    public Sim(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaSim(){
        System.out.println("Il mio numero : " + numeroDiTelefono);
        System.out.println("Il mio credito : " + creditoDisponibile);
        System.out.println("Ultime chiamate : ");
        for (int i = 1; i < chiamate.length; i++) {
            System.out.println("Chiamata n. " + i);
            chiamate[i].stampaChiamata();
        }
    }
}
