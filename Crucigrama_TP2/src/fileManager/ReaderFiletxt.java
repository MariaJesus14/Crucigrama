/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileManager;

import View.Start;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.CrossWord;
import model.Word;

/**
 *
 * @author Roibin
 */
public class ReaderFiletxt {
    String level1 = "C:\\Prueba\\facil\\1.txt";

    public CrossWord readFileEasy(String root, int lengArray) throws IOException {
        String[][] matrixEasy;
        String[] file = loadFile(root, lengArray);
        String[] words;
        Word[] listWord = new Word[file.length-1];
        int var =0;
        
        int row = Character.getNumericValue(file[0].charAt(0));
        int column = Character.getNumericValue(file[0].charAt(2));
        
        for (int i = 1; i < file.length; i++, var++) {
            words = file[i].split("/");
            listWord[var] = new Word(Character.getNumericValue(words[0].charAt(0)), Character.getNumericValue(words[0].charAt(2)), Integer.parseInt(words[1]), words[2], words[3], words[4]);
        }
        CrossWord cross = new CrossWord(row, column, listWord);
        return cross;
    }

    public String[] loadFile(String rootFile, int lengArray) throws FileNotFoundException, IOException {
        String cadena;
        int contador = 0;
        String[] arrayFile;
        FileReader file = new FileReader(rootFile);
        BufferedReader buffer = new BufferedReader(file);
        arrayFile = new String[lengArray];
        while ((cadena = buffer.readLine()) != null) {
            arrayFile[contador] = cadena;
            contador++;
        }
        buffer.close();
        return arrayFile;
    }

}
