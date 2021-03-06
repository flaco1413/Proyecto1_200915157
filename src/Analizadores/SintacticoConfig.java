
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Mar 17 22:19:59 CST 2015
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Mar 17 22:19:59 CST 2015
  */
public class SintacticoConfig extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SintacticoConfig() {super();}

  /** Constructor which sets the default scanner. */
  public SintacticoConfig(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SintacticoConfig(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\011\000\010\003\006\004\004\005\007\001\002\000" +
    "\012\002\ufffc\003\ufffc\004\ufffc\005\ufffc\001\002\000\012" +
    "\002\ufffe\003\ufffe\004\ufffe\005\ufffe\001\002\000\012\002" +
    "\ufffb\003\ufffb\004\ufffb\005\ufffb\001\002\000\012\002\ufffd" +
    "\003\ufffd\004\ufffd\005\ufffd\001\002\000\012\002\000\003" +
    "\006\004\004\005\007\001\002\000\004\002\012\001\002" +
    "\000\004\002\001\001\002\000\012\002\uffff\003\uffff\004" +
    "\uffff\005\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\011\000\010\002\010\003\007\004\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\012\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SintacticoConfig$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SintacticoConfig$actions(this);
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
    return action_obj.CUP$SintacticoConfig$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



/**Metodo al que se llama automáticamente ante algún error sintactico.*/
public void syntax_error(Symbol s){
System.out.println("Error sintactico en la Linea " + (s.right+1) +" Columna "+s.left+ ". Identificador " +s.value + " no reconocido." );
}
/**Metodo al que se llama en el momento en que ya no es posible una recuperación de errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
System.out.println("Error sintactico sin recuperación en la Linea " + (s.right+1)+ "Columna "+s.left+". Identificador " + s.value + " no reconocido.");
}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SintacticoConfig$actions {



  private final SintacticoConfig parser;

  /** Constructor */
  CUP$SintacticoConfig$actions(SintacticoConfig parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SintacticoConfig$do_action(
    int                        CUP$SintacticoConfig$act_num,
    java_cup.runtime.lr_parser CUP$SintacticoConfig$parser,
    java.util.Stack            CUP$SintacticoConfig$stack,
    int                        CUP$SintacticoConfig$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SintacticoConfig$result;

      /* select the action based on the action number */
      switch (CUP$SintacticoConfig$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ESTRUCTURA ::= error 
            {
              Object RESULT =null;

              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",2, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          return CUP$SintacticoConfig$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ESTRUCTURA ::= errorlex 
            {
              Object RESULT =null;
		 System.out.println("ERRORputo");
              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",2, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          return CUP$SintacticoConfig$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ESTRUCTURA ::= identificador 
            {
              Object RESULT =null;
		System.out.println("IDENTIFICADOR"); 
              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",2, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          return CUP$SintacticoConfig$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= ESTRUCTURA 
            {
              Object RESULT =null;

              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          return CUP$SintacticoConfig$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= INICIO ESTRUCTURA 
            {
              Object RESULT =null;

              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.elementAt(CUP$SintacticoConfig$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          return CUP$SintacticoConfig$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // START ::= INICIO 
            {
              Object RESULT =null;

              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          return CUP$SintacticoConfig$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.elementAt(CUP$SintacticoConfig$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.elementAt(CUP$SintacticoConfig$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$SintacticoConfig$stack.elementAt(CUP$SintacticoConfig$top-1)).value;
		RESULT = start_val;
              CUP$SintacticoConfig$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.elementAt(CUP$SintacticoConfig$top-1)), ((java_cup.runtime.Symbol)CUP$SintacticoConfig$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SintacticoConfig$parser.done_parsing();
          return CUP$SintacticoConfig$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

