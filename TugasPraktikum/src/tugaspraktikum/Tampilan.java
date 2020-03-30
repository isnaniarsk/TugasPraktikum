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
public class Tampilan extends JFrame{
     String Nama, JenisKel, Agama, Hobi;
    
    JLabel lNama = new JLabel(" NAMA : ");
    JLabel lJenisKel = new JLabel(" JENIS KELAMIN : ");
    JLabel lAgama = new JLabel(" AGAMA: ");
    JLabel lHobi = new JLabel(" HOBI: ");
    JLabel saveNama= new JLabel();
    JLabel saveJenisKel= new JLabel();
    JLabel saveAgama= new JLabel();
    JLabel saveHobi= new JLabel();
    
    public Tampilan(String Nama, String JenisKel, String Agama, String Hobi){
        setTitle("TAMPILAN");
	setDefaultCloseOperation(3);
	setSize(400,200);
        setLocation(500,200);

        this.Nama= Nama;
        this.JenisKel=JenisKel;
        this.Agama=Agama;
        this.Hobi=Hobi;
        saveNama.setText(Nama);
        saveJenisKel.setText(JenisKel);    
        saveAgama.setText(Agama); 
        saveHobi.setText(Hobi);
        
        setLayout(null);
        add(lNama);
        add(lJenisKel);
        add(lAgama);
        add(lHobi);
        add(saveNama);
        add(saveJenisKel);
        add(saveAgama);
        add(saveHobi);

        lNama.setBounds(20,20,140,20);
	lJenisKel.setBounds(20,50,140,20);
        lAgama.setBounds(20,80,140,20);
        lHobi.setBounds(20,110,140,20);
        saveNama.setBounds(130,20,150,20);
	saveJenisKel.setBounds(130,50,140,20);
        saveAgama.setBounds(130,80,140,20);
        saveHobi.setBounds(130,110,140,20);

        setVisible(true);
    }
}

    


