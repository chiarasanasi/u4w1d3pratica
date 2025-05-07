package Esercizio3;

import java.io.OptionalDataException;

public class MainEsercizio3 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(0123,"Chiara Sanasi", "chiarasanasi99@gmail.com","07/05/2025");

        Articolo articolo1  = new Articolo(456,"Maglietta", 25.50, 5);
        Articolo articolo2  = new Articolo(486,"Occhiali", 6, 1);
        Articolo articolo3  = new Articolo(264,"Scarpe", 120, 2);

        Articolo[] articoli = new Articolo[3];
        articoli[0] = articolo1;
        articoli[1] = articolo2;
        articoli[2] = articolo3;

        Carrello ilMioCarrello = new Carrello(cliente1, articoli);

        ilMioCarrello.stampaCarrello();


    }

}
