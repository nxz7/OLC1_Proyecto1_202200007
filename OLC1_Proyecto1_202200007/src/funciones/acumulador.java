/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author natalia
 */
public class acumulador {
    public static StringBuilder outputText = new StringBuilder();

    public static void addToOutput(String textToAdd) {
        outputText.append(textToAdd).append("\n");
    }
    public static void addSalida(String textToAdd) {
        outputText.append(textToAdd);
    }
    public static String getOutputText() {
        return outputText.toString();
    }
}


