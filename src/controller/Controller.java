/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author milan
 */
public class Controller {
    
    private static Controller instance;

    public static Controller getInstance() {
        
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
    
    
    private List<Knjiga> listaKnjiga;
    private List<Autor> listaAutora;

    public Controller() {
    
        listaKnjiga = new ArrayList<>();
        listaAutora = new ArrayList<>();
        
        Autor a1 = new Autor("Ivo","Andric",1892,"Loren ipsum Ivo Andric");
        Autor a3 = new Autor("Mesa","Selimovic",1919,"Loren ipsum Mesa");
        Autor a2 = new Autor("Danilo","Kis",1935,"Loren ipsum Danilo Kis");
        
        Knjiga k1 = new Knjiga("Na Drini cuprija", a1, "123455",1945,Zanr.ISTORIJSKI);
        Knjiga k2 = new Knjiga("Basta, pepeo", a2, "123455123",1982,Zanr.DETEKTIVSKI);
        Knjiga k3 = new Knjiga("Tvrdjava", a3, "123455553",1970,Zanr.ROMAN);
        listaAutora.add(a1);
        listaAutora.add(a2);
        listaAutora.add(a3);
        
        listaKnjiga.add(k1);
        listaKnjiga.add(k2);
        listaKnjiga.add(k3);
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void obrisiKnjigu(int selektovanRed) {
        listaKnjiga.remove(selektovanRed);
    }

    public void dodajKnjigu(Knjiga nova) {
        listaKnjiga.add(nova);

    }
    
    
    
    
    
    
}
