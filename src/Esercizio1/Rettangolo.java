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



    public void stampaRettangolo(){
        System.out.println("il perimetro del rettangolo è " + calcoloPerimetro());
        System.out.println("l'area del rettangolo è " + calcoloArea());

    }

    public void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Rettangolo 1 : ");
        r1.stampaRettangolo();

        System.out.println("Rettangolo 2 : ");
        r2.stampaRettangolo();

        double sommaAree = r1.calcoloArea() + r2.calcoloArea();
        double sommaPerimetri = r1.calcoloPerimetro() + r2.calcoloPerimetro();

        System.out.println("Somma dei perimetri : " + sommaPerimetri);
        System.out.println("Somma delle aree : " + sommaAree);
    }


}
