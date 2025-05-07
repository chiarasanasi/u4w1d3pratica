package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;

//costruttore
    public Carrello(Cliente cliente, Articolo[] elencoArticoli) {
        this.cliente = cliente;
        this.elencoArticoli = elencoArticoli;
    }

    private double totaleCosto(){
        double totale = 0;
        for (int i = 0; i < elencoArticoli.length; i++) {
            totale += elencoArticoli[i].getPrezzo();
        }
        return totale;
    }


    public void stampaCarrello() {
        System.out.println("Cliente: " + cliente.toString());
        System.out.println("Articoli nel carrello:");
        for (int i = 0; i < elencoArticoli.length; i++) {
            System.out.println("- " + elencoArticoli[i]);
        }
        System.out.println("Totale: €" + totaleCosto());
    }


}
