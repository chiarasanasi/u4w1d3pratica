package Esercizio2;

public class MainEsercizio2 {
    public static void main(String[] args) {
        Sim simChiara = new Sim(0000001,"0 €");

        Chiamata[] chiamate = new Chiamata[5];

        Chiamata chiamata1 = new Chiamata(1234, 2);
        Chiamata chiamata2 = new Chiamata(1235, 0.12);
        Chiamata chiamata3 = new Chiamata(1236, 5.2);
        Chiamata chiamata4 = new Chiamata(1237, 8);
        Chiamata chiamata5 = new Chiamata(1238, 21);

        chiamate[0]=chiamata1;
        chiamate[1]=chiamata2;
        chiamate[2]=chiamata3;
        chiamate[3]=chiamata4;
        chiamate[4]=chiamata5;

        simChiara.setChiamate(chiamate);
        simChiara.stampaSim();

    }
}
