package it.nava.progettopizza;

import java.util.ArrayList;
import java.util.List;

public class ListeProdotti {

    String categorieProdotti[] = { "Pizza", "Panino", "Bibita", "Stuzzicheria" };

    List<Prodotto> listaPizze = new ArrayList<Prodotto>(); // Categoria 1
    List<Prodotto> listaPanini = new ArrayList<Prodotto>(); // Categoria 2
    List<Prodotto> listaBibite = new ArrayList<Prodotto>(); // Categoria 3
    List<Prodotto> listaStuzzicherie = new ArrayList<Prodotto>(); // Categoria 4

    public ListeProdotti(){
        letturaProdotti();
    }

    private void letturaProdotti(){
        //MetodiPubblici.richiestaMenu();
    }

    // Get e Set

    public String getNomePizza(int pos){
        Prodotto pizza = listaPizze.get(pos);
        return pizza.getNome();
    }

    public List<Prodotto> getListaPizze() {
        return listaPizze;
    }

    public List<Prodotto> getListaPanini() {
        return listaPanini;
    }

    public List<Prodotto> getListaBibite() {
        return listaBibite;
    }

    public List<Prodotto> getListaStuzzicherie() {
        return listaStuzzicherie;
    }
}
