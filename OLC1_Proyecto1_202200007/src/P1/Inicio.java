
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
                                console::print = Media(@notas), Mediana([8,10,11,9,5]), Moda(@notas), Varianza(@notas), Max(@notas), Min(@notas) end;
                                console::print = "Hola Mundo", MOD(10, 9), notaAprobar, labelAprobar end;
                         
                                var:double:: gb1 <- 61 end;
                         	var:char[]:: gbt <- "Datos" end;
                                            
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
                                        values::double = [2,2,2,SUM(4,1),5,7,8,MUL(4,SUM(1,1))] end;
                                        titulo::char[] = titulo1 end;
                                        EXEC Histogram end;
                                    ) end;
                         
	|/                       graphBar(
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
