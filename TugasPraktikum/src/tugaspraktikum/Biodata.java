/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

/**
 *
 * @author ASUS
 */
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Biodata extends JFrame{
    String Nama, JenisKel, Agama, Hobi;

    final JTextField fNama = new JTextField(20);

    JLabel lNama = new JLabel(" NAMA ");
    JLabel lJenisKel = new JLabel(" JENIS KELAMIN ");
    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton(" Perempuan ");
    JLabel lAgama = new JLabel(" AGAMA ");
    String[] namaAgama =
        {"Islam", "Kristen", "Katholik", "Budha", "Hindu"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    JLabel lHobi = new JLabel(" HOBI ");
    JCheckBox cbBola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");
    JButton btnSave = new JButton("Save");

    JLabel hNama = new JLabel();
    JLabel hJenisKel = new JLabel();
    JLabel hAgama = new JLabel();
    JLabel hHobi = new JLabel();

        public Biodata(){
            setTitle (" BIODATA ");
            setDefaultCloseOperation(3);
            setSize(400,280);
            setLocation(500,200);

            ButtonGroup group = new ButtonGroup();
            group.add(rbPria);
            group.add(rbWanita);

            setLayout (null);
            add(lNama);
            add(fNama);
            add(lJenisKel);
            add(rbPria);
            add(rbWanita);
            add(lAgama);
            add(cmbAgama);
            add(lHobi);
            add(cbBola);
            add(cbBasket);
            add(btnSave);
         
            add(hNama);
            add(hJenisKel);
            add(hAgama);
            add(hHobi);

            lNama.setBounds(10,20,120,20);
            fNama.setBounds(130,20,150,20);
            lJenisKel.setBounds(10,50,120,20);
            rbPria.setBounds(125,50,100,20);
            rbWanita.setBounds(225,50,100,20);
            lAgama.setBounds(10,80,150,20);
            cmbAgama.setBounds(130,80,150,20);
            lHobi.setBounds(10,110,120,20);
            cbBola.setBounds(125,110,100,20);
            cbBasket.setBounds(225,110,150,20);
            btnSave.setBounds(110,160,120,20);
            
            btnSave.addActionListener((ActionEvent e) -> {
                if(fNama.getText().length() == 0){
                    JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong");
                } else{
                    Nama = fNama.getText();
                    
                    if(rbPria.isSelected()){
                        JenisKel = rbPria.getText();
                    } else if(rbWanita.isSelected()){
                        JenisKel = rbWanita.getText();
                    }
                    Agama = (String) cmbAgama.getSelectedItem();
                    
                    if(cbBola.isSelected() && cbBasket.isSelected())
                    {
                        Hobi = cbBola.getText() + " dan " +cbBasket.getText();
                    } else if(cbBola.isSelected()){
                        Hobi = cbBola.getText();
                    } else if(cbBasket.isSelected()){
                        Hobi = cbBasket.getText();
                    }
                    Tampilan tampilan = new Tampilan(Nama, JenisKel, Agama, Hobi);
                    setVisible(true);
                } dispose();
            });
            
            setVisible(true);
        }

     }

   
