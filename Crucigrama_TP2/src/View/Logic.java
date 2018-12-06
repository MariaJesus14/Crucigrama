/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Logic { 
    
    GestorEs gestor = new GestorEs();
    
    public void checkInput (){
        String letters;
        Scanner scan = new Scanner (System.in);
        while(!scan.hasNext("[A-Za-z]")){
            System.out.println("Invalido");
            scan.next();
        }
        letters = scan.next();
        System.out.println("letters = "+letters);
    }
    
}
