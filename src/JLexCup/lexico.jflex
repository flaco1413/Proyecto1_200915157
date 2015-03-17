%%

%public
%class MiScanner1
%unicode
%line
%column
%apiprivate
%standalone

Digito=[09]
Numero={Digito}+

%%

{Numero} { System.out.println("Linea: " + (yyline+1) + " Columna: " + (yycolumn+1) + " - Numero: " + yytext()); }
"+" { System.out.println("Linea: " + (yyline+1) + " Columna: " + (yycolumn+1) + " - Signo +"); }
"-" { System.out.println("Linea: " + (yyline+1) + " Columna: " + (yycolumn+1) + " - Signo -"); }
"*" { System.out.println("Linea: " + (yyline+1) + " Columna: " + (yycolumn+1) + " - Signo *"); }
"/" { System.out.println("Linea: " + (yyline+1) + " Columna: " + (yycolumn+1) + " - Signo /"); }

. { System.out.println("Linea: " + (yyline+1) + " Columna: " + (yycolumn+1) + " - Error Lexico en: " + yytext()); }