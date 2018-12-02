
package model;

/**
 *
 * @author Usuario
 */


//El archivo del crucigrama debe seguir el siguiente formato:
//• En la primera línea debe aparecer la cantidad de filas y columnas de la cuadrícula, separadas
//por guion.
//• Desde la segunda línea y hasta el fin de archivo, se coloca en cada línea la información de cada
//palabra: primero la posición inicial (fila y columna, separadas por guion), segundo en número
//de palabra, tercero si es vertical u horizontal (V o H) en mayúscula, cuarto la palabra en
//mayúscula y quinto la pista de la palabra. Cada segmento de información separado por slash
//(/).

public class Word {
    private int row;
    private int column;
    private int initialindex;
    private int finalindex;
    private int numword;
    private final static String V= "V";
    private final static String H= "H";
    private String word;
    private String track;
    String rows= Integer.toString(row);
    String columns= Integer.toString(column);
    String initialindexs=Integer.toString(initialindex);
    String finalindexs=Integer.toString(finalindex);
   String numwords=Integer.toString(numword);

    public Word() {
    }

    public Word(int row, int column, int initialindex, int finalindex, int numword, String word, String track) {
        this.row = row;
        this.column = column;
        this.initialindex = initialindex;
        this.finalindex = finalindex;
        this.numword = numword;
        this.word = word;
        this.track = track;
    }

    public int getRow() {
        return row;
    }

    public void setRow(String row) {
        this.rows = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.columns = column;
    }

    public int getInitialindex() {
        return initialindex;
    }

    public void setInitialindex(String initialindex) {
        this.initialindexs = initialindex;
    }

    public int getFinalindex() {
        return finalindex;
    }

    public void setFinalindex(String finalindex) {
        this.finalindexs= finalindex;
    }

    public int getNumword() {
        return numword;
    }

    public void setNumword(String numword) {
        this.numwords = numword;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }
    
    
     public String toFileString(){
         return row+"-"+column+"-"+initialindex+"-"+finalindex+"-"+numword+"-"+word+"-"+track;
     }
    
}
