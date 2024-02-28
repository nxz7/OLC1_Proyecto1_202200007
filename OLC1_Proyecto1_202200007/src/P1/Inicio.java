
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

                         	!Prints
                         	var:char[]:: titulo1 <- "Titulo histograma prueba" end;
                                arr:double:: @notas <- [7, MUL(75, 0.45), DIV(SUM(80,20), RES(75,25))] end;
                         
                         	Histogram(
                         		
                         		values::double = [2,2,2,5,5,7,8] end;
                                        titulo::char[] = titulo1 end;
                         		EXEC Histogram end;
                         	) end;
                         
                         	Histogram(
                                        titulo::char[] = "EL SEGUNDO" end;          		
                                        values::double = @notas end;
                                        
                                        EXEC Histogram end;
                                 ) end;
                                                  
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
        /*
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
        graficos.createHistogram("Histogram Example", histogramValores, Color.RED);*/
       
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
    }
    

        
 
    
}
