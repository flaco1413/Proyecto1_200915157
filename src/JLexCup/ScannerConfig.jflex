package Analizadores;

import java_cup.runtime.Symbol;

%%
%cupsym SymConfig
%class LexicoConfig
%cup
%unicode
%public
%line
%column
%char
%ignorecase

numero =[0-9]+ "."? [0-9]*
letra =[a-zA-ZñÑ]+
identificador={letra}({letra}|{numero}|"_")*
path=({letra}":\"\\")
textop =\"[^\r\n]*\" 

%%

/*Expresiones Regulares*/
{identificador} {return new Symbol(SymConfig.identificador, yychar,yyline,new String(yytext()));}


/*Reswords*/



/*Espacios en Blanco*/
[ \t\r\f\n]+ { /* Se ignoran */}
/* Cualquier Otro */
. {return new Symbol(SymConfig.errorlex, yychar,yyline,new String(yytext())); }