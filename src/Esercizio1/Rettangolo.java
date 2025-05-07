package Esercizio1;

public class Rettangolo {

    private final double altezza;
    private final double larghezza;

    // Costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public double calcoloPerimetro(){
        return (altezza+larghezza)*2;
    }
    public double calcoloArea(){
        return larghezza*altezza;
    }



}
