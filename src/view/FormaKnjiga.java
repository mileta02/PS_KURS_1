/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;


import controller.Controller;
import static java.lang.Integer.parseInt;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author milan
 */
public class FormaKnjiga extends javax.swing.JDialog {

    /**
     * Creates new form FormaKnjiga
     */
    
    private GlavnaForma gf;
    private Controller kontroler;
    private Knjiga knjigaZaIzmenu;
    
    public FormaKnjiga(java.awt.Frame parent, boolean modal, Knjiga knjigaZaIzmenu) {
        super(parent, modal);
        
        gf = (GlavnaForma) parent;
        initComponents();           
        kontroler = Controller.getInstance();
        popuniComboBoxAutorima();
        jButtonIzmeni.setVisible(true);
        if(knjigaZaIzmenu!=null){
            this.knjigaZaIzmenu=knjigaZaIzmenu;
            jTextFieldNaziv.setText(knjigaZaIzmenu.getNaslov());
            jTextFieldISBN.setText(knjigaZaIzmenu.getISBN());
            jComboBox1.setSelectedItem(knjigaZaIzmenu.getAutor());
            jComboBoxZanr.setSelectedItem(knjigaZaIzmenu.getZanr());
            jTextFieldGodina.setText(String.valueOf(knjigaZaIzmenu.getGodinaIzdanja()));
            jButtonDodaj.setVisible(false);

        }else{
        jButtonIzmeni.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jTextFieldGodina = new javax.swing.JTextField();
        jTextFieldNaziv = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonDodaj = new javax.swing.JButton();
        jButtonDodajOdustani = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jButtonIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Godina izdanja");

        jLabel2.setText("Naziv");

        jLabel3.setText("Autor");

        jLabel4.setText("ISBN");

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jTextFieldGodina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGodinaActionPerformed(evt);
            }
        });

        jTextFieldNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNazivActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jButtonDodajOdustani.setText("Odustani");
        jButtonDodajOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajOdustaniActionPerformed(evt);
            }
        });

        jLabel5.setText("Zanr");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values())
        );
        jComboBoxZanr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxZanrActionPerformed(evt);
            }
        });

        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButtonDodaj)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonDodajOdustani))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButtonIzmeni)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDodaj)
                    .addComponent(jButtonDodajOdustani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIzmeni)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldGodinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGodinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGodinaActionPerformed

    private void jTextFieldNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNazivActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        
         String naziv = jTextFieldNaziv.getText();
         String isbn = jTextFieldISBN.getText();
         
         int godIzdanja = 0;
         
         try{
          godIzdanja = Integer.parseInt(jTextFieldGodina.getText());
         }catch(Exception e){
             JOptionPane.showMessageDialog(this, "Greska");
         }
        
          Zanr zanr = (Zanr)jComboBoxZanr.getSelectedItem();
    
          Autor autor = (Autor)jComboBox1.getSelectedItem();
          
          Knjiga nova = new Knjiga(naziv,autor,isbn,godIzdanja,zanr);
          
          kontroler.dodajKnjigu(nova);
          JOptionPane.showMessageDialog(this, "Uspesno dodata");
          gf.osveziTabelu();
          
          
          this.dispose();
          
    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jButtonDodajOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajOdustaniActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButtonDodajOdustaniActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBoxZanrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxZanrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxZanrActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        String naziv = jTextFieldNaziv.getText();
         String isbn = jTextFieldISBN.getText();
         
         int godIzdanja = 0;
         
         try{
          godIzdanja = Integer.parseInt(jTextFieldGodina.getText());
         }catch(Exception e){
             JOptionPane.showMessageDialog(this, "Greska");
         }
        
          Zanr zanr = (Zanr)jComboBoxZanr.getSelectedItem();
    
          Autor autor = (Autor)jComboBox1.getSelectedItem();
          
          knjigaZaIzmenu.setAutor(autor);
          knjigaZaIzmenu.setZanr(zanr);
          knjigaZaIzmenu.setNaslov(naziv);
          knjigaZaIzmenu.setGodinaIzdanja(godIzdanja);
          Knjiga novaKnjiga = new Knjiga(naziv,autor,isbn,godIzdanja,zanr);
          kontroler.azurirajKnjigu(novaKnjiga);
          
          
          gf.osveziTabelu();
          JOptionPane.showMessageDialog(null, "Uspesno izmenjena");
          this.dispose();
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonDodajOdustani;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JComboBox<Autor> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldGodina;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxAutorima() {
        jComboBox1.removeAllItems();
        List<Autor> autori = kontroler.ucitajListuAutoraIzBaze();
        for(Autor a:autori){
            jComboBox1.addItem(a);
        }
        
    }
}
