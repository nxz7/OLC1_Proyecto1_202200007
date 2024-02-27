
package P1;

import funciones.ErroresList;
import funciones.TokenList;
import funciones.graficos;
import java.awt.Color;
import java.io.StringReader;
import java.util.List;
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
                                console::column  "test" -> [10, 45, 27] end;
                         	
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
       
        //graficos graphGenerator = new graficos("Graphs");

        //barra
        List<Object> barEjex = List.of("1 parcial", "2 parcial", "final");
        List<Object> barEjey = List.of(50.0, 30.0, 70.0);
        graficos.createBarGraph("ESTUDIANTES", "ACTIVIDADES", "NOTA", barEjex, barEjey, Color.BLUE);

        // Pie 
        List<Object> pieLabels = List.of("UNO", "DOS", "TRES");
        List<Object> pieValues = List.of(50.0, 30.0, 20.0);
        graficos.createPieGraph("Pie Chart Example", pieLabels, pieValues, Color.GRAY);

        // Line graph
        List<Object> lineEjex = List.of("1 parcial", "2 parcial", "final");
        List<Object> lineEjey = List.of(50.0,30.0,70.0);
        graficos.createLineGraph("grafica de linea", "actividades", "notas", lineEjex, lineEjey, Color.BLUE);

        // Histogram
        List<Object> histogramValores = List.of(2.0,2.0,2.0,7.0,8.0,5.0,5.0);
        graficos.createHistogram("Histogram Example", histogramValores, Color.RED);
       
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
