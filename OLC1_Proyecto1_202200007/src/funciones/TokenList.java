/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

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
}