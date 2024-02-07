// ------------  Paquete e importaciones ------------
package analizadores; 
import java_cup.runtime.*;
//import funciones.TokenList;





%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 

// ------> Expresiones Regulares 

numero = ([0-9]+\.[0-9]+)|([0-9]+)
cadena_f=[\"][^\"\n]+[\"]
comentario_multi = [\<][\!][^\!\>]+[\!][\>]
comentario_una = [\!][^\n]+
//letra = [^\s]

//ARREGLAR EL COMENTARIO, QUE SE AGREGA A ERROR 


%%
// ------------  Reglas Lexicas -------------------
";" {funciones.TokenList.addTokenToList(yyline ,yycolumn,yytext(), "PUNTOYCOMA"); return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext()); }
":" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "DOSPUNTOS"); return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext()); }
"," {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "COMA"); return new Symbol(sym.COMA, yycolumn, yyline, yytext()); }
"END" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "FIN"); return new Symbol(sym.FIN, yycolumn, yyline, yytext()); }
"CONSOLE" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "CONSOLE"); return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext()); }
"PRINT" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "PRINT"); return new Symbol(sym.PRINT, yycolumn, yyline, yytext()); }
"=" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "IGUAL"); return new Symbol(sym.IGUAL, yycolumn, yyline, yytext()); }
{numero}  {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "NUMERO"); return new Symbol(sym.NUMERO, yycolumn, yyline, yytext()); }
{cadena_f}  {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "CADENA_F"); return new Symbol(sym.CADENA_F, yycolumn, yyline, yytext()); }
"var" {funciones.TokenList.addTokenToList(yyline ,yycolumn,yytext(), "var"); return new Symbol(sym.VAR, yycolumn, yyline, yytext()); }
"DOUBLE" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "DOUBLE"); return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }
"-" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "GUION"); return new Symbol(sym.GUION, yycolumn, yyline, yytext()); }
"PROGRAM" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "PROGRAMPAL"); return new Symbol(sym.PROGRAMPAL, yycolumn, yyline, yytext()); }
"[" {funciones.TokenList.addTokenToList(yyline ,yycolumn,yytext(), "ABRIRCORCHETES"); return new Symbol(sym.ABRIRCORCHETES, yycolumn, yyline, yytext()); }
"]" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "CERRARCORCHETES"); return new Symbol(sym.CERRARCORCHETES, yycolumn, yyline, yytext()); }
"CHAR" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), " CADENACHAR "); return new Symbol(sym.CADENACHAR, yycolumn, yyline, yytext()); }
"ARR" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "ARREGLO"); return new Symbol(sym.ARREGLO, yycolumn, yyline, yytext()); }
"@" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "ARROBA"); return new Symbol(sym.ARROBA, yycolumn, yyline, yytext()); }
"(" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "ABRIRPARENTESIS"); return new Symbol(sym.ABRIRPARENTESIS, yycolumn, yyline, yytext()); }
")" {funciones.TokenList.addTokenToList(yyline ,yycolumn,yytext(), "CERRARPARENTESIS"); return new Symbol(sym.CERRARPARENTESIS, yycolumn, yyline, yytext()); }
//OP ARITMETICAS
"SUM" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "SUMA"); return new Symbol(sym.SUMA, yycolumn, yyline, yytext()); }
"RES" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "RESTA"); return new Symbol(sym.RESTA, yycolumn, yyline, yytext()); }
"MUL" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MULTIPLICACION"); return new Symbol(sym.MULTIPLICACION, yycolumn, yyline, yytext()); }
"DIV" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "DIVISION"); return new Symbol(sym.DIVISION, yycolumn, yyline, yytext()); }
"MOD" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MODULO"); return new Symbol(sym.MODULO, yycolumn, yyline, yytext()); }

//ESTADISTICAS
"MEDIA" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MEDIA"); return new Symbol(sym.MEDIA, yycolumn, yyline, yytext()); }
"MEDIANA" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MEDIANA"); return new Symbol(sym.MEDIANA, yycolumn, yyline, yytext()); }
"MODA" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MODA"); return new Symbol(sym.MODA, yycolumn, yyline, yytext()); }
"VARIANZA" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "VARIANZA"); return new Symbol(sym.VARIANZA, yycolumn, yyline, yytext()); }
"MAX" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MAX"); return new Symbol(sym.MAX, yycolumn, yyline, yytext()); }
"MIN" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "MIN"); return new Symbol(sym.MIN, yycolumn, yyline, yytext()); }

"COLUMN" {funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "COLUMN"); return new Symbol(sym.COLUMN, yycolumn, yyline, yytext()); }

//GRAFICAS
"EXEC" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "EXEC"); return new Symbol(sym.EXEC, yycolumn, yyline, yytext()); }
"VALUES" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "VALUES"); return new Symbol(sym.VALUES, yycolumn, yyline, yytext()); }
"TITULO" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "TITULO"); return new Symbol(sym.TITULO, yycolumn, yyline, yytext()); }
"LABEL" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "LABEL"); return new Symbol(sym.LABEL, yycolumn, yyline, yytext()); }
"GRAPHBAR" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "GRAPHBAR"); return new Symbol(sym.GRAPHBAR, yycolumn, yyline, yytext()); }
"GRAPHPIE" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "GRAPHPIE"); return new Symbol(sym.GRAPHPIE, yycolumn, yyline, yytext()); }  
"GRAPHLINE" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "GRAPHLINE"); return new Symbol(sym.GRAPHLINE, yycolumn, yyline, yytext()); }
"HISTOGRAM" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "HISTOGRAM"); return new Symbol(sym.HISTOGRAM, yycolumn, yyline, yytext()); }
"EJEX" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "EJEX"); return new Symbol(sym.EJEX, yycolumn, yyline, yytext()); }
"EJEY" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "EJEY"); return new Symbol(sym.EJEY, yycolumn, yyline, yytext()); } 
"TITULOX" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "TITULOX"); return new Symbol(sym.TITULOX, yycolumn, yyline, yytext()); }
"TITULOY" { funciones.TokenList.addTokenToList(yyline , yycolumn, yytext(), "TITULOY"); return new Symbol(sym.TITULOY, yycolumn, yyline, yytext()); }




{comentario_multi} {}
{comentario_una} {}

//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ funciones.ErroresList.addErrorToList(yyline , yycolumn, yytext(), "LEXICO"); System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


