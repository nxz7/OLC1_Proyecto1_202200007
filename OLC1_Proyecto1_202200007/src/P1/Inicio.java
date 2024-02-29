
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
        //aaaaaaa
        //analizadores("src/analizadores/", "Lexer.jflex", "Parser.cup");
        
        String entrada = """ 
PROGRAM
                        	! Variables
                        	var:double:: notaAprobar <- 70 end;
                        	var:char[]:: labelAprobar <- "P1" end;
                        	
                        	! Arreglos
                        	arr:double:: @notas <- [61, 80, 70] end;
                        	arr:char[]:: @labels <- ["p1", "P2", "FINAL"] end;
                                var:char[]:: titulo1 <- "Titulo histograma" end;
                               console::column = "test" -> [10, 15.5, 61.1] end;
                               console::column = "Notas" -> @notas end;
                                console::column = titulo1 -> @labels end;
                                	
                                console::print = "Media", "Mediana", "Moda", "Varianza", "Max", "Min" end;
                                console::print = Media(@notas), Mediana(@notas), Moda(@notas), Varianza(@notas), Max(@notas), Min(@notas) end;
                                console::print = "Hola Mundo", MOD(10, 9), notaAprobar, labelAprobar end;
                         
                                var:double:: gb1 <- 61 end;
                         	var:char[]:: gbt <- "Datos" end;
	|                       graphBar(
                                                                                         !grafica 1
                                        tituloX::char[] = "UNOOO" end;
                                        tituloY::char[] = gbt end;
                                        titulo::char[] = "BARRAz" end;
                                        ejeX::char[] = ["1 Parcial", "2 parcial", "Final"] end;
                                        ejeY::double = [50, 70, 90] end;
                                        EXEC graphBar end;
                                                                                     ) end;                                                  
                                graphLine(
                                	!testing de variables en graficas
                                	titulo::char[] = "titulo lines" end;
                         		ejeX::char[] = @labels end;
                         		ejeY::double = [50,30,70] end;
                                	tituloX::char[] = "actividades" end;
                                	tituloY::char[] = "tituloy" end;
                                		EXEC graphLine end;
                                	) end;
                         
                                graphPie(
                                		<! FELICIDADES
                                		La de pie es facil !>
                                	
                                label::char[] = ["UNO", "DOS", "TRES" ] end;
                                titulo::char[] = "PIE PIE PIE" end;
                                values::double = @notas end;
                                	EXEC graphPie end;
                                	) end;
                         
                                Histogram(
                                        values::double = [2,2,2,5,5,7,8] end;
                                        titulo::char[] = titulo1 end;
                                        EXEC Histogram end;
                                    ) end;
                         
	|                       graphBar(
                                        !grafica 1
                                        tituloX::char[] = "TITULOX" end;
                                        tituloY::char[] = gbt end;
                                        titulo::char[] = "BARRAz" end;
                                        ejeX::char[] = ["1 Parcial", "2 parcial", "Final"] end;
                                        ejeY::double = [gb1, 30, 70] end;
                                        EXEC graphBar end;
                                    ) end;                                                                          
                                	

                        	
                        	
                        <! En las graficas los datos se declaran directamente o por medio de variables
                        Buena suerte
                        Deben generar todas las graficas en una ejecucion
                         !>
                        
                        END PROGRAM
                         """;
        //MOSTRAR---------
        
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("\"");
        List<Object> lineEjex = List.of("1 parcial", "2 parcial", "final");
        List<Object> lineEjey = List.of(50.0,30.0,70.0);
        
        //graficos.createLineGraph("grafica de linea", "actividades", "notas", lineEjex, lineEjey, Color.BLUE);
        
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
