/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author natalia
 */

public class token {
    public int linea;
    public int columna;
    public String lexema;
    public String tipo;

    public token(int linea, int columna, String lexema, String tipo) {
        this.linea = linea;
        this.columna = columna;
        this.lexema = lexema;
        this.tipo = tipo;
    }
}

