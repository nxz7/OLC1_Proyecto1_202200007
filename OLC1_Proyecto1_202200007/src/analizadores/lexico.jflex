package analizadores;

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class lexico
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
%} 

comentario = []
numero = ([0-9]+\.[0-9]+)|([0-9]+)

%%


";" {return new Symbol(sym.PUNTOYCOMA,yyline,yychar, yytext());} 
"(" {return new Symbol(sym.PARENTESISABRIR,yyline,yychar, yytext());} 
")" {return new Symbol(sym.PARENTESISCERRAR,yyline,yychar, yytext());} 
"[" {return new Symbol(sym.CORCHETEABRIR,yyline,yychar, yytext());} 
"]" {return new Symbol(sym.CORCHETEABRIR,yyline,yychar, yytext());} 
"SUM" {return new Symbol(sym.SUMA,yyline,yychar, yytext());} 
"RES" {return new Symbol(sym.RESTA,yyline,yychar, yytext());} 
"MUL" {return new Symbol(sym.MULTIPLICACION,yyline,yychar, yytext());} 
"DIV" {return new Symbol(sym.DIVISION,yyline,yychar, yytext());} 
"MEDIA" {return new Symbol(sym.MEDIA,yyline,yychar, yytext());} 
"MEDIANA" {return new Symbol(sym.MEDIANA,yyline,yychar, yytext());} 
"MODA" {return new Symbol(sym.MODA,yyline,yychar, yytext());} 
"VARIANZA" {return new Symbol(sym.VARIANZA,yyline,yychar, yytext());} 
"MAX" {return new Symbol(sym.MAX,yyline,yychar, yytext());} 
"MIN" {return new Symbol(sym.MIN,yyline,yychar, yytext());} 
"VAR" {return new Symbol(sym.VARIABLE,yyline,yychar, yytext());} 
":" {return new Symbol(sym.DOSPUNTOS,yyline,yychar, yytext());} 
"PROGRAM" {return new Symbol(sym.PROGRAMINICIO,yyline,yychar, yytext());} 
"ENDPROGRAM" {return new Symbol(sym.PROGRAMFIN,yyline,yychar, yytext());} 
"!" {return new Symbol(sym.EXCLAMACION,yyline,yychar, yytext());} 
">" {return new Symbol(sym.MAYORQUE,yyline,yychar, yytext());} 
"<" {return new Symbol(sym.MENORQUE,yyline,yychar, yytext());}
"DOUBLE" {return new Symbol(sym.DOUBLE,yyline,yychar, yytext());} 
"CHAR" {return new Symbol(sym.CHAR,yyline,yychar, yytext());} 
"ARR" {return new Symbol(sym.ARREGLO,yyline,yychar, yytext());} 
"@" {return new Symbol(sym.ARROBA,yyline,yychar, yytext());} 
"END" {return new Symbol(sym.FIN,yyline,yychar, yytext());} 
"CONSOLE" {return new Symbol(sym.CONSOLE,yyline,yychar, yytext());} 
"PRINT" {return new Symbol(sym.PRINT,yyline,yychar, yytext());} 
"=" {return new Symbol(sym.IGUAL,yyline,yychar, yytext());} 
"COLUMN" {return new Symbol(sym.FCOLUMNA,yyline,yychar, yytext());}
"EXEC" {return new Symbol(sym.SALIRGRAF,yyline,yychar, yytext());} 
"VALUES" {return new Symbol(sym.VALUES,yyline,yychar, yytext());} 
"TITULO" {return new Symbol(sym.TITULO,yyline,yychar, yytext());} 
"LABEL" {return new Symbol(sym.LABEL,yyline,yychar, yytext());} 
"GRAPHBAR" {return new Symbol(sym.GRAPHBAR,yyline,yychar, yytext());} 
"GRAPHPIE" {return new Symbol(sym.GRAPHPIE,yyline,yychar, yytext());}  
"GRAPHLINE" {return new Symbol(sym.GRAPHLINE,yyline,yychar, yytext());} 
"HISTOGRAM" {return new Symbol(sym.HISTOGRAM,yyline,yychar, yytext());} 
"EJEX" {return new Symbol(sym.EJEX,yyline,yychar, yytext());} 
"EJEY" {return new Symbol(sym.EJEY,yyline,yychar, yytext());}  
"TITULOX" {return new Symbol(sym.TITULOX,yyline,yychar, yytext());} 
"TITULOY" {return new Symbol(sym.TITULOY,yyline,yychar, yytext());} 


comentario {}
{numero} {return new Symbol(sym.numero,yyline,yychar, yytext());} 




//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); }