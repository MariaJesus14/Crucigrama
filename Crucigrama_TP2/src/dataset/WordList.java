/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataset;

import model.Word;

/**
 *
 * @author Maria Rodriguez
 */
public class WordList {
    private Word [][] matrix;
    private int counter;
    private int row;
    private int column;
    private int initialindex;
    private int finalindex;
    private int numwordV;
    private int numwordH;
    String rows= Integer.toString(row);
    String columns= Integer.toString(column);
    String initialindexs=Integer.toString(initialindex);
    String finalindexs=Integer.toString(finalindex);
    String numwordsH=Integer.toString(numwordH);
    String numwordsV=Integer.toString(numwordV);

    public WordList() {
    }

    public WordList(Word[][] matrix, int counter) {
        this.matrix = matrix;
        this.counter = counter;
    }

    public Word[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Word[][] matrix) {
        this.matrix = matrix;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
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
        this.columns= column;
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

    public int getNumwordV() {
        return numwordV;
    }

    public void setNumwordV(String numword) {
        this.numwordsV = numword;
    }
    public int getNumwordH() {
        return numwordH;
    }

    public void setNumwordH(String numword) {
        this.numwordsH = numword;
    }
//    public void createMatrix (){
//        matrix [row][column];
//        
//    }
     public String toFileString(){
    return row+"-"+column+"-"+initialindex+"-"+finalindex+"-"+numwordH+"-"+numwordV;
     }
}
