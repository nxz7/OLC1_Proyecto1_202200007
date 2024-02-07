/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

/**
 *
 * @author natalia
 */

import java.io.IOException;

import java.io.FileWriter;

public class ErroresList {
    static class ErrorNode {
        error error;
        ErrorNode next;

        public ErrorNode(error error) {
            this.error = error;
            this.next = null;
        }
    }

    private static ErrorNode head;

    public static void addErrorToList(int linea, int columna, String descripcion, String tipo) {
        error newError = new error(linea, columna, descripcion, tipo);
        ErrorNode newNode = new ErrorNode(newError);

        if (head == null) {
            head = newNode;
        } else {
            ErrorNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void printErrorList() {
        ErrorNode temp = head;
        while (temp != null) {
            error error = temp.error;
            System.out.println("Linea: " + error.linea +
                    ", Columna: " + error.columna +
                    ", Descripcion: '" + error.descripcion + '\'' +
                    ", Tipo: '" + error.tipo + '\'');
            temp = temp.next;
        }
    }
    
    public static void genHTMLErrorList() {
        String filePath = "TablaErrores.html"; 
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("<html>\n<head>\n<title>Error List</title>\n");
            writer.write("<style>\n");
            writer.write("table {\n");
            writer.write("    border-collapse: collapse;\n");
            writer.write("    width: 100%;\n");
            writer.write("}\n");
            writer.write("th, td {\n");
            writer.write("    padding: 8px;\n");
            writer.write("    text-align: left;\n");
            writer.write("    border-bottom: 1px solid #ddd;\n");
            writer.write("}\n");
            writer.write("tr:nth-child(even) {\n");
            writer.write("    background-color: #f2f2f2;\n");
            writer.write("}\n");
            writer.write("th {\n");
            writer.write("    background-color: #FFB6C1; /* Baby pink */\n");
            writer.write("    color: white;\n");
            writer.write("}\n");
            writer.write("tr:hover {\n");
            writer.write("    background-color: #f5f5f5;\n");
            writer.write("}\n");
            writer.write("</style>\n");
            writer.write("</head>\n<body>\n<table>\n");
            writer.write("<tr><th>#</th><th>Linea</th><th>Columna</th><th>Descripcion</th><th>Tipo</th></tr>\n");

            int rowNumber = 1; 
            ErrorNode temp = head;
            while (temp != null) {
                error error = temp.error;
                writer.write("<tr><td>" + rowNumber + "</td><td>" + error.linea + "</td><td>" +
                        error.columna + "</td><td>" + "se obtuvo:"+ error.descripcion + "</td><td>" + error.tipo + "</td></tr>\n");
                temp = temp.next;
                rowNumber++;
            }

            writer.write("</table>\n</body>\n</html>");
            writer.close();
            System.out.println("HTML de tabla de errores generada bajo el nombre: " + filePath);
        } catch (IOException e) {
            System.out.println("ERROR EN CREAR LA TABLA DE ERRORES -> " + e.getMessage());
        }
    }
}
