
package P1;

import funciones.ErroresList;
import funciones.TokenList;
import java.io.StringReader;
//import funciones.IdArrayHashMap;
/**
 *
 * @author natalia
 */
public class Inicio {

    public static void main(String[] args) {
        gui inicioM = new gui();
        inicioM.setVisible(true);
        //funciones.funcion.mostrar("hola");s
        
        //analizadores("src/analizadores/", "Lexer.jflex", "Parser.cup");
        
        String entrada = """ 
                        PROGRAM
                         	
                         	var:double:: notaAprobar <- 61 end;
                         	var:char[]:: labelAprobar <- "Nota Minima" end;
                         	***
                         	! Arreglos
                         	arr:double:: @notas <- [notaAprobar, MUL(75, 0.45), DIV(SUM(80,20), RES(75,25))] end;
                         	arr:char[]:: @labels <- [labelAprobar, "P1", "P2"] end;
                         	?
                         	!Prints
                         	var:char[]:: titulo1 <- "Titulo histograma" end;
                         	console::column = "test" -> [10, 15.5, 61.1] end;
                         	console::column = "Notas" -> @notas end;
                         	console::column = titulo1 -> @labels end;
                                console::column  "test" -> [10, 15.5, 61.1] end;
                         	
                         	console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                         	console::print = Media(@notas), Mediana(@notas), Moda(@notas), Varianza(@notas), Max(@notas), Min(@notas) end;
                         	console::print = "Hola Mundo", MOD(10, 9), notaAprobar, labelAprobar end;
                         	
                         	<! FELICIDADES
                         		Lo de arriba ya es medio proyecto
                         		Tu puedes !>
                         	
                         	var:double:: gb1 <- 61 end;
                         	var:char[]:: gbt <- "Datos" end;
                                console::print = gbt, GB1 end;
                         	
                         <! En las graficas los datos se declaran directamente o por medio de variables
                         Buena suerte
                         Deben generar todas las graficas en una ejecucion
                          !>
                         
                         END PROGRAM
                         """;
        //MOSTRAR---------
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("\"");
        
        //analizar(entrada);
        //TokenList.printTokenList();
       //TokenList.genHTMLTokenList();
       //ErroresList.genHTMLErrorList();
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
    /*
    public static void analizar (String entrada){
        try {
            analizadores.Lexer lexer = new analizadores.Lexer(new StringReader(entrada));
            //TokenList.printTokenList();    
            analizadores.Parser parser = new analizadores.Parser(lexer);
            parser.parse();
            //System.out.println("DENTRO DE ANALIZAR:");
            //TokenList.printTokenList();
            System.out.println("-----------------------------------");
        } catch (Exception e) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println(e);
        } 
    }*/
    

        
 
    
}
