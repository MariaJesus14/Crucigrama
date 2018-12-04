/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import View.Start;
import dataset.UsersList;
import View.Logic;

/**
 *
 * @author Usuario
 */
public class Main {

   
    public static UsersList listManager = new UsersList ();
    public static void main(String[] args) {
       Logic logic = new Logic();
       Start start = new Start();
       logic.checkInput();
       start.setVisible(true);
    }
    
}
