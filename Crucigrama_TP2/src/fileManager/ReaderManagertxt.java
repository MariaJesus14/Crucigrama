package fileManager;

import dataset.WordList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import model.Word;

public class ReaderManagertxt {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }
    
    public Word read() throws IOException {
        Word word = null;
        String line = reader.readLine(); 
        WordList wl = new WordList();
      
        String [] datosWord;
        String [] datosPosition;
        if (line != null) {
            word = new Word();
            datosWord = line.split("/");
            datosPosition= line.split("-");
//            word.setRow(datos[0]);
//            word.setColumn(datos[1]);
//           word.setInitialindex(datos[2]);
//           word.setFinalindex(datos[3]);
//            word.setNumword(datos[4]);
            word.setWord(datosWord[0]);
            word.setTrack(datosWord[1]);
            
            
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
