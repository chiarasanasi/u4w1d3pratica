package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;
    private double totaleCosto;


//costruttore
    public Carrello(Cliente cliente, Articolo[] elencoArticoli) {
        this.cliente = cliente;
        this.elencoArticoli = elencoArticoli;
        calcoloTotale();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotaleCosto() {
        return totaleCosto;
    }


    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setElencoArticoli(Articolo[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
        calcoloTotale();
    }

    private void calcoloTotale(){
        for (int i = 0; i < elencoArticoli.length; i++) {
            totaleCosto = totaleCosto + elencoArticoli[i].getPrezzo();
        }
    }

}
