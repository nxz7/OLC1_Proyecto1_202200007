
package P1;

import funciones.ErroresList;
import funciones.TokenList;
import java.io.StringReader;

/**
 *
 * @author natalia
 */
public class Inicio {

    public static void main(String[] args) {
        gui inicioM = new gui();
        inicioM.setVisible(true);
        //funciones.funcion.mostrar("hola");s
        
        analizadores("src/analizadores/", "Lexer.jflex", "Parser.cup");
        
        String entrada = """ 
                         console::print="hola",27, SUM(7,5) end;
                         !COMENTARIOll
                         + /
                         var:char[]::primero <- "prueba" end;
                         
                         arr:DOUBLE::@carray <- [27, 2, 7 ] end;                         
                         console::print="dos",7,"jeje", primero end;?
                         <!skshkshs
                         sjsjsj!>
                         
                         var:double::segundo <- 2.5 end;
                         console::print="dospuntoCNCO",segundo end;?
                         arr:DOUBLE::@carray <- [27, 2, segundo ] end;   
                         arr:char[]::@carray <- ["todo", "es", "nuevo" ] end;
                         
                         console::print=div(10,res(11,7)),mod(5,2),mul(segundo,2) end;
                         """;
        //MOSTRAR---------
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("\"");
        
        //analizar(entrada);
        TokenList.printTokenList();
        TokenList.genHTMLTokenList();
        ErroresList.genHTMLErrorList();
    }
    
    public static void analizadores(String ruta, String jflexFile, String cupFile){
        try {
            String opcionesJflex[] =  {ruta+jflexFile,"-d",ruta};
            jflex.Main.generate(opcionesJflex);

            String opcionesCup[] =  {"-destdir", ruta,"-parser","Parser",ruta+cupFile};
            java_cup.Main.main(opcionesCup);
            
        } catch (Exception e) {
            System.out.println("No se ha podido generar los analizadores");
            System.out.println(e);
        }
    }
    
    public static void analizar (String entrada){
        try {
            analizadores.Lexer lexer = new analizadores.Lexer(new StringReader(entrada));
            TokenList.printTokenList();    
            analizadores.Parser parser = new analizadores.Parser(lexer);
            parser.parse();
            System.out.println("DENTRO DE ANALIZAR:");
            TokenList.printTokenList();
            System.out.println("-----------------------------------");
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }
    

        
 
    
}
