
package funciones;

import java.util.ArrayList;

/**
 *
 * @author natalia
 */

// VARIABLE PARA DECLARAR COSAS Y HACER LA TABLA DE SIMBOLOS --------

public class valor_variable {
    public String id;                                   
    public String tipo;                                 
    //public String clase;                                 
    public String valoract;                       
    public ArrayList<Object> valorArreglo;              
    public int fila;                                    // -> implementar despues
    public int columna;                                 // -> implementar despues  
    public String valorst;             
    
    public valor_variable(String id, String tipo, String valoract, ArrayList<Object> valorArreglo, int fila, int columna, String valorst){
        
        this.id = id;
        this.tipo = tipo;
        //this.clase =clase;
        this.valoract = valoract;
        this.valorArreglo = valorArreglo;
        this.fila = fila;
        this.columna = columna;
        this.valorst = valorst;
    }
    
}
