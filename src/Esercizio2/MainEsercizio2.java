package Esercizio2;

public class MainEsercizio2 {
    public static void main(String[] args) {
        Sim simChiara = new Sim("3304567892");

        simChiara.setCreditoDisponibile(10);

        Chiamata[] chiamate = new Chiamata[5];

        chiamate[0] = new Chiamata("3123145762", 2);
        chiamate[1] = new Chiamata("3532165135", 0.12);
        chiamate[2] = new Chiamata("3012345212", 5.2);
        chiamate[3]= new Chiamata("3120154585", 8);
        chiamate[4] = new Chiamata("3801456461", 21);



        simChiara.setChiamate(chiamate);
        simChiara.stampaSim();

    }
}
