/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author natalia
 */
public class error {
    public int linea;
    public int columna;
    public String descripcion;
    public String tipo;

    public error(int linea, int columna, String descripcion, String tipo) {
        this.linea = linea;
        this.columna = columna;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

}
