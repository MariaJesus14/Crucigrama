/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Roibin
 */
public class CrossWord {

    public CrossWord(int rows, int columns, Word[] arrayWord) {
        this.rows = rows;
        this.columns = columns;
        this.arrayWord = arrayWord;
    }
    
    
    public CrossWord() {
        
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Word[] getArrayWord() {
        return arrayWord;
    }

    public void setArrayWord(Word[] arrayWord) {
        this.arrayWord = arrayWord;
    }

    @Override
    public String toString() {
        return "CrossWord{" + "rows=" + rows + ", columns=" + columns + ", arrayWord=" + arrayWord + '}';
    }
    
    private int rows;
    private int columns;
    private Word[] arrayWord;
    
}
