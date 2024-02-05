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

comentario = []

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

comentario {}

//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }


