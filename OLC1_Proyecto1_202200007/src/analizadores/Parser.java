
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;
import funciones.token;
import funciones.valor;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\004" +
    "\000\002\004\005\000\002\005\012\000\002\006\005\000" +
    "\002\006\003\000\002\007\003\000\002\007\003\000\002" +
    "\010\003\000\002\010\010\000\002\010\010\000\002\010" +
    "\010\000\002\010\010\000\002\010\010" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\006\003\004\011\006\001\002\000\006\005" +
    "\067\010\070\001\002\000\010\002\ufffe\003\ufffe\011\ufffe" +
    "\001\002\000\004\006\014\001\002\000\010\002\000\003" +
    "\004\011\006\001\002\000\004\002\012\001\002\000\010" +
    "\002\ufffd\003\ufffd\011\ufffd\001\002\000\004\002\001\001" +
    "\002\000\010\002\uffff\003\uffff\011\uffff\001\002\000\004" +
    "\006\015\001\002\000\004\014\016\001\002\000\004\004" +
    "\017\001\002\000\020\012\027\013\022\032\020\033\030" +
    "\034\021\035\026\036\024\001\002\000\004\030\062\001" +
    "\002\000\004\030\055\001\002\000\010\007\ufff5\010\ufff5" +
    "\031\ufff5\001\002\000\006\007\ufff8\010\ufff8\001\002\000" +
    "\004\030\050\001\002\000\006\007\ufff6\010\ufff6\001\002" +
    "\000\004\030\043\001\002\000\006\007\ufff7\010\ufff7\001" +
    "\002\000\004\030\036\001\002\000\006\007\032\010\033" +
    "\001\002\000\020\012\027\013\022\032\020\033\030\034" +
    "\021\035\026\036\024\001\002\000\004\005\034\001\002" +
    "\000\010\002\ufffa\003\ufffa\011\ufffa\001\002\000\006\007" +
    "\ufff9\010\ufff9\001\002\000\016\013\022\032\020\033\030" +
    "\034\021\035\026\036\024\001\002\000\004\007\040\001" +
    "\002\000\016\013\022\032\020\033\030\034\021\035\026" +
    "\036\024\001\002\000\004\031\042\001\002\000\010\007" +
    "\ufff3\010\ufff3\031\ufff3\001\002\000\016\013\022\032\020" +
    "\033\030\034\021\035\026\036\024\001\002\000\004\007" +
    "\045\001\002\000\016\013\022\032\020\033\030\034\021" +
    "\035\026\036\024\001\002\000\004\031\047\001\002\000" +
    "\010\007\ufff1\010\ufff1\031\ufff1\001\002\000\016\013\022" +
    "\032\020\033\030\034\021\035\026\036\024\001\002\000" +
    "\004\007\052\001\002\000\016\013\022\032\020\033\030" +
    "\034\021\035\026\036\024\001\002\000\004\031\054\001" +
    "\002\000\010\007\ufff0\010\ufff0\031\ufff0\001\002\000\016" +
    "\013\022\032\020\033\030\034\021\035\026\036\024\001" +
    "\002\000\004\007\057\001\002\000\016\013\022\032\020" +
    "\033\030\034\021\035\026\036\024\001\002\000\004\031" +
    "\061\001\002\000\010\007\ufff2\010\ufff2\031\ufff2\001\002" +
    "\000\016\013\022\032\020\033\030\034\021\035\026\036" +
    "\024\001\002\000\004\007\064\001\002\000\016\013\022" +
    "\032\020\033\030\034\021\035\026\036\024\001\002\000" +
    "\004\031\066\001\002\000\010\007\ufff4\010\ufff4\031\ufff4" +
    "\001\002\000\010\002\ufffc\003\ufffc\011\ufffc\001\002\000" +
    "\004\005\071\001\002\000\010\002\ufffb\003\ufffb\011\ufffb" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\012\002\007\003\006\004\004\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\012\005\010\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\006" +
    "\030\007\022\010\024\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\007\034\010" +
    "\024\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\036\001\001\000\002\001\001\000" +
    "\004\010\040\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\043\001\001\000\002\001\001\000\004\010" +
    "\045\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\050\001\001\000\002\001\001\000\004\010\052\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\055" +
    "\001\001\000\002\001\001\000\004\010\057\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\062\001\001" +
    "\000\002\001\001\000\004\010\064\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public String resultado = ""; 
    public ArrayList<valor> lista = new ArrayList<>();

    public void syntax_error(Symbol s)
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Recuperado" );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Sin recuperacion." );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {

  
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= lista_instr 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // lista_instr ::= lista_instr instruccion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_instr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // lista_instr ::= instruccion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_instr",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= impresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= error PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= error FIN PUNTOYCOMA 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // impresion ::= CONSOLE DOSPUNTOS DOSPUNTOS PRINT IGUAL lista_expresion FIN PUNTOYCOMA 
            {
              Object RESULT =null;
		 
        System.out.print("!Salida: ");
        for (valor v : lista) {
            System.out.print("," + v.resultado);
        }
        lista.clear(); // Limpiar la lista después de imprimir
        System.out.println(" ");
    
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("impresion",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista_expresion ::= lista_expresion COMA expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // lista_expresion ::= expresion 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= CADENA_F 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                valor elemento = new valor("string", "primitivo", a, null, a);
		lista.add(elemento);
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= aritmetica 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		           
                if (val instanceof Double) {
                    valor elemento = new valor("double", "primitivo", val.toString(), null, val.toString());
                    lista.add(elemento);
                } else if (val instanceof String) {
                    valor elemento = new valor("string", "primitivo", (String) val, null, (String) val);
                    lista.add(elemento);
                } else {
                    System.out.print("NO FUNCIONO");
                }
           
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // aritmetica ::= NUMERO 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 
                RESULT = Double.parseDouble(val);
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("aritmetica",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // aritmetica ::= SUMA ABRIRPARENTESIS aritmetica COMA aritmetica CERRARPARENTESIS 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
                        double result_s = (Double) izq + (Double) der;
                        RESULT = result_s; 
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("aritmetica",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // aritmetica ::= RESTA ABRIRPARENTESIS aritmetica COMA aritmetica CERRARPARENTESIS 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
                        double result_s = (Double) izq - (Double) der;
                        RESULT = result_s; 
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("aritmetica",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // aritmetica ::= MULTIPLICACION ABRIRPARENTESIS aritmetica COMA aritmetica CERRARPARENTESIS 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
                        double result_s = (Double) izq * (Double) der;
                        RESULT = result_s; 
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("aritmetica",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // aritmetica ::= DIVISION ABRIRPARENTESIS aritmetica COMA aritmetica CERRARPARENTESIS 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
                        double result_s = (Double) izq / (Double) der;
                        RESULT = result_s; 
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("aritmetica",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // aritmetica ::= MODULO ABRIRPARENTESIS aritmetica COMA aritmetica CERRARPARENTESIS 
            {
              Object RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object izq = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int derright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object der = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
                        double result_s = (Double) izq % (Double) der;
                        RESULT = result_s; 
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("aritmetica",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
