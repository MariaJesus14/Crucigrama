
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

    public Word(int row, int column, int numberWord, String orientation, String lettler, String wordHelp) {
        this.row = row;
        this.column = column;
        this.numberWord = numberWord;
        this.orientation = orientation;
        this.lettler = lettler;
        this.wordHelp = wordHelp;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getNumberWord() {
        return numberWord;
    }

    public void setNumberWord(int numberWord) {
        this.numberWord = numberWord;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getLettler() {
        return lettler;
    }

    public void setLettler(String lettler) {
        this.lettler = lettler;
    }

    public String getWordHelp() {
        return wordHelp;
    }

    public void setWordHelp(String wordHelp) {
        this.wordHelp = wordHelp;
    }
 
    private int row;
    private int column;
    private int numberWord;
    private String orientation;
    private String lettler;
    private String wordHelp;
    

    public Word() {
    }

    
}
