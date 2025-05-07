package Esercizio2;

public class Chiamata {
    private final int numeroChiamato;
    private final double durata;

    public Chiamata(int numeroChiamato, double durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }


    public void stampaChiamata(){
        System.out.println("Numero Chiamato : " + numeroChiamato);
        System.out.println("Durata Chiamata : " + durata);
    }
}
