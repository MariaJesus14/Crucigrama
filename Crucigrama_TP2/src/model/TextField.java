/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Maria Rodriguez
 */
public class TextField extends JTextField implements ActionListener{

    public TextField(int x, int y, int ancho, int alto ) {
        setBounds(x, y, ancho, alto);
        addActionListener(this);
    }
    public void setName (int x, int y ){
        setText((x+1)+ "-"+ (y+1));
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(Color.white);
    }
    
    
}
