/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Knjiga;

/**
 *
 * @author milan
 */
public class ModelTabeleKnjige extends AbstractTableModel {
    private List<Knjiga> listaKnjiga;
    private String[] kolone={"Naslov","Autor","ISBN","Godina izdanja"};

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }
    
    
   
    @Override
    public int getRowCount() {
        return listaKnjiga.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Knjiga knjiga = listaKnjiga.get(rowIndex);
       switch(columnIndex){
           case 0: return knjiga.getNaslov(); 
           case 1: return knjiga.getAutor().getIme() + knjiga.getAutor().getPrezime(); 
           case 2: return knjiga.getISBN();
           case 3: return knjiga.getGodinaIzdanja();
           default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
        
       return kolone[column]; 
        
    }

    void osveziTabelu() {
      fireTableDataChanged();
    }
    
    
    
}
