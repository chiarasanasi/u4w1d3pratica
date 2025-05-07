package Esercizio1;

public class MainEsercizio1 {

    public static void stampaRettangolo(Rettangolo r1){
        System.out.println("il perimetro del rettangolo è " + r1.calcoloPerimetro());
        System.out.println("l'area del rettangolo è " + + r1.calcoloArea());

    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        System.out.println("Rettangolo 1 : ");
        stampaRettangolo(r1);

        System.out.println("Rettangolo 2 : ");
        stampaRettangolo(r2);

        double sommaAree = r1.calcoloArea() + r2.calcoloArea();
        double sommaPerimetri = r1.calcoloPerimetro() + r2.calcoloPerimetro();

        System.out.println("Somma dei perimetri : " + sommaPerimetri);
        System.out.println("Somma delle aree : " + sommaAree);
    }

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5,4);
        Rettangolo rettangolo2 = new Rettangolo(8,13);

        stampaDueRettangoli(rettangolo1,rettangolo2);

    }
}
