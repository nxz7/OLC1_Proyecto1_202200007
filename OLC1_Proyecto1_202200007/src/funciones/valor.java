
package funciones;

import java.util.ArrayList;

/**
 *
 * @author natalia
 * 
 */

//------->

public class valor {
    public String tipo; //int o string
    public String clase; // vector o pri
    public String resultado; // si es string o itn
    public ArrayList<valor> resultado_vector = new ArrayList<>(); //en caso de arreglo-> vector
    
    //impresion 
    public String impresion;
    
    public valor(String tipo, String clase, String resultado, ArrayList<valor> resultado_vector, String impresion) {
        this.tipo = tipo;
        this.clase = clase;
        this.resultado = resultado;
        this.resultado_vector = resultado_vector;
        this.impresion = impresion;
    }
}


