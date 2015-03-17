package proyecto1_200915157;
import java_cup.runtime.Symbol;
%%
numero =[0-9]+ "."? [0-9]*
letra =[a-zA-ZñÑ]+
texto =({letra}|{numero}|"_")+
textop =\"[^\r\n]*\" 
%cupsym simbolos
%class lexico
%cup
%unicode
%public
%line
%column
%char
%ignorecase
%%

/*Expresiones Regulares*/
{texto} {return new Symbol(simbolos.texto, yychar,yyline,new String(yytext()));}
{textop} {return new Symbol(simbolos.textop, yychar,yyline,new String(yytext()));}

/*Reswords*/
"<estructura>" {return new Symbol(simbolos.est, yychar,yyline,new String(yytext()));}
"</estructura>" {return new Symbol(simbolos.endEst, yychar,yyline,new String(yytext()));}

"<directorio>" {return new Symbol(simbolos.dir, yychar,yyline,new String(yytext()));}
"</directorio>" {return new Symbol(simbolos.endDir, yychar,yyline,new String(yytext()));}

"<carpeta>" {return new Symbol(simbolos.car, yychar,yyline,new String(yytext()));}
"</carpeta>" {return new Symbol(simbolos.endCar, yychar,yyline,new String(yytext()));}

"<documento>" {return new Symbol(simbolos.doc, yychar,yyline,new String(yytext()));}
"</documento>" {return new Symbol(simbolos.endDoc, yychar,yyline,new String(yytext()));}

"<nombre>" {return new Symbol(simbolos.nom, yychar,yyline,new String(yytext()));}
"</nombre>" {return new Symbol(simbolos.endNom, yychar,yyline,new String(yytext()));}

"<formato>" {return new Symbol(simbolos.f, yychar,yyline,new String(yytext()));}
"</formato>" {return new Symbol(simbolos.endF, yychar,yyline,new String(yytext()));}

"<contenido>" {return new Symbol(simbolos.con, yychar,yyline,new String(yytext()));}
"</contenido>" {return new Symbol(simbolos.endCon, yychar,yyline,new String(yytext()));}


/*Espacios en Blanco*/
[ \t\r\f\n]+ { /* Se ignoran */}
/* Cualquier Otro */
. {//TextEditor.errores.add(new Errors(1,yytext(),yyline, yycolumn)); 
return new Symbol(simbolos.errorlex, yychar,yyline,new String(yytext())); }