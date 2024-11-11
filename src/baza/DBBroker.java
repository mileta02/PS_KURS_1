/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author milan
 */
public class DBBroker {

    private Konekcija konekcija = Konekcija.getInstance();
    
    
    public List<Knjiga> ucitajListuKnjiga() {
        List<Knjiga> lista = new ArrayList<>();
        try {
            String upit = "Select * from knjiga k join autor a ON a.id=k.autorId;";
            Statement st = konekcija.getConnection().createStatement();
            ResultSet rs= st.executeQuery(upit);
            while(rs.next()){
                int id = rs.getInt("id");
                String naslov = rs.getString("naslov");
                int godinaIzdanja = rs.getInt("godinaIzdanja");
                String ISBN = rs.getString("ISBN");
                String zanr = rs.getString("zanr");
                Zanr z = Zanr.TRAGEDY;
                
                
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                String bio = rs.getString("biografija");
                int godRodj = rs.getInt("godinaRodjenja");
                int autorId = rs.getInt("autorId");
                Autor a = new Autor(autorId, ime, prezime, godRodj, bio);
                
                
                Knjiga k = new Knjiga(id,naslov,a,ISBN,godinaIzdanja,z);
                lista.add(k);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    public List<Autor> ucitajListuAutora() {
         List<Autor> lista = new ArrayList<>();
         
          try {
            String upit = "Select * from autor;";
            Statement st = konekcija.getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()){    
                String ime = rs.getString("ime");
                String prezime = rs.getString("prezime");
                String bio = rs.getString("biografija");
                int godRodj = rs.getInt("godinaRodjenja");
                int autorId = rs.getInt("id");
                Autor a = new Autor(autorId, ime, prezime, godRodj, bio);         
                lista.add(a);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    public void obrisiKnjigu(int id) {
       String upit = "DELETE FROM knjiga where id=?";
        try {
            PreparedStatement ps = konekcija.getConnection().prepareStatement(upit);
            ps.setInt(1,id);
            ps.executeUpdate();
            konekcija.getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dodajKnjigu(Knjiga nova) {
        String upit = "INSERT INTO knjiga (id,naslov,autorId,ISBN,godinaIzdanja,zanr)"+ "VALUES (?,?,?,?,?,?);";
        
        int id = nova.getId();
        String naslov = nova.getNaslov();
        String isbn = nova.getISBN();
        int idAutor = nova.getAutor().getId();
        int godIzdanja = nova.getGodinaIzdanja();
        String zanr = String.valueOf(nova.getZanr());
        
        PreparedStatement ps;
        try {
            ps = konekcija.getConnection().prepareStatement(upit);
            ps.setInt(1, 0);
            ps.setString(2,naslov);
            ps.setInt(3, idAutor);
            ps.setString(4,isbn);
            ps.setInt(5,godIzdanja);
            ps.setString(6,zanr);
            ps.executeUpdate();
            konekcija.getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void azurirajKnjigu(Knjiga novaKnjiga) {
       String upit = "UPDATE knjiga SET naslov=?,autorId=?,godinaIzdanja=?,zanr=? where id=?";
        
        int id = novaKnjiga.getId();
        String naslov = novaKnjiga.getNaslov();

        int idAutor = novaKnjiga.getAutor().getId();
        int godIzdanja = novaKnjiga.getGodinaIzdanja();
        String zanr = String.valueOf(novaKnjiga.getZanr());
        
        PreparedStatement ps;
        try {
            ps = konekcija.getConnection().prepareStatement(upit);
            ps.setString(1,naslov);
            ps.setInt(2,idAutor);
            ps.setInt(3, godIzdanja);
            ps.setString(4,zanr);
            ps.setInt(5,id);
            ps.executeUpdate();
            konekcija.getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
