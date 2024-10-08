/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author natalia
 */
public class TokenList {
    static class TokenNode {
        token token;
        TokenNode next;

        public TokenNode(token token) {
            this.token = token;
            this.next = null;
        }
    }

    private static TokenNode head;

    public static void addTokenToList(int linea, int columna, String lexema, String tipo) {
        token newToken = new token(linea, columna, lexema, tipo);
        TokenNode newNode = new TokenNode(newToken);

        if (head == null) {
            head = newNode;
        } else {
            TokenNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void printTokenList() {
        TokenNode temp = head;
        while (temp != null) {
            token token = temp.token;
            System.out.println("Linea: " + token.linea +
                    ", Columna: " + token.columna +
                    ", Lexema: '" + token.lexema + '\'' +
                    ", Tipo: '" + token.tipo + '\'');
            temp = temp.next;
        }
    }
    
    public static void genHTMLTokenList() {
        String filePath = "TablaTokens.html"; 
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("<html>\n<head>\n<title>Token List</title>\n");
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
            writer.write("    background-color: #6A5ACD; /* Baby purple */\n");
            writer.write("    color: white;\n");
            writer.write("}\n");
            writer.write("tr:hover {\n");
            writer.write("    background-color: #f5f5f5;\n");
            writer.write("}\n");
            writer.write("</style>\n");
            writer.write("</head>\n<body>\n<table>\n");
            writer.write("<tr><th>#</th><th>Linea</th><th>Columna</th><th>Lexema</th><th>Tipo</th></tr>\n");

            int rowNumber = 1; 
            TokenNode temp = head;
            while (temp != null) {
                token token = temp.token;
                writer.write("<tr><td>" + rowNumber + "</td><td>" + token.linea + "</td><td>" +
                        token.columna + "</td><td>" + token.lexema + "</td><td>" + token.tipo + "</td></tr>\n");
                temp = temp.next;
                rowNumber++;
            }

            writer.write("</table>\n</body>\n</html>");
            writer.close();
            System.out.println("HTML de tabla de tokens generada bajo el nombre: " + filePath);
        } catch (IOException e) {
            System.out.println("ERROR EN CREAR LA TABLA DE TOKENS -> " + e.getMessage());
        }
    }
}