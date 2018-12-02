package filemanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import main.Main;

import model.Word;

public class ReaderManagertxt {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    
    public Word read() throws IOException {
        Word word = null;
        String line = reader.readLine(); 
        String [] datos;
        if (line != null) {
            word = new Word();
            datos = line.split("-");
            word.setRow(datos[0]);
            word.setColumn(datos[1]);
           word.setInitialindex(datos[2]);
           word.setFinalindex(datos[3]);
            word.setNumword(datos[4]);
            word.setWord(datos[5]);
            word.setTrack(datos[6]);
            
        }
        return word;
    }
//    public void readAll () throws IOException{
//        Word word = read();
//        while (word != null){
//            Main.listManager.addUser();
//            word = read();
//        }
//    }

    public void close() throws IOException {
        reader.close();
    }
}
