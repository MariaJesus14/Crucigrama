
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
    
}
