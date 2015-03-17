
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Mar 16 22:13:20 CST 2015
//----------------------------------------------------

package proyecto1_200915157;

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Mar 16 22:13:20 CST 2015
  */
public class sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\011\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\005\000\002\005\006" +
    "\000\002\006\011\000\002\006\002\000\002\007\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\004\005\005\001\002\000\006\002\ufffe\005" +
    "\ufffe\001\002\000\004\007\012\001\002\000\006\002\000" +
    "\005\005\001\002\000\004\002\010\001\002\000\004\002" +
    "\001\001\002\000\006\002\uffff\005\uffff\001\002\000\004" +
    "\023\015\001\002\000\004\006\014\001\002\000\006\002" +
    "\ufffd\005\ufffd\001\002\000\004\010\016\001\002\000\006" +
    "\006\ufffa\011\017\001\002\000\004\015\021\001\002\000" +
    "\004\006\ufffc\001\002\000\004\024\022\001\002\000\004" +
    "\016\023\001\002\000\004\013\025\001\002\000\004\012" +
    "\040\001\002\000\004\015\026\001\002\000\004\024\027" +
    "\001\002\000\004\016\030\001\002\000\004\017\031\001" +
    "\002\000\004\024\032\001\002\000\004\020\033\001\002" +
    "\000\004\021\034\001\002\000\004\023\035\001\002\000" +
    "\004\022\036\001\002\000\004\014\037\001\002\000\004" +
    "\012\ufff9\001\002\000\006\006\ufffa\011\017\001\002\000" +
    "\004\006\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\010\002\006\003\005\004\003\001\001\000" +
    "\002\001\001\000\004\005\012\001\001\000\004\004\010" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\017\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\023\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\040\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintactico$actions(this);
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
    return action_obj.CUP$sintactico$do_action(act_num, parser, stack, top);
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

public void metodo2(){}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$sintactico$actions {



  private final sintactico parser;

  /** Constructor */
  CUP$sintactico$actions(sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$sintactico$do_action(
    int                        CUP$sintactico$act_num,
    java_cup.runtime.lr_parser CUP$sintactico$parser,
    java.util.Stack            CUP$sintactico$stack,
    int                        CUP$sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintactico$result;

      /* select the action based on the action number */
      switch (CUP$sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DOCUMENTO ::= doc nom texto endNom f texto endF con textop endCon endDoc 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("DOCUMENTO",5, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CARPETA ::= 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("CARPETA",4, ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CARPETA ::= car nom texto endNom DOCUMENTO endCar CARPETA 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("CARPETA",4, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DIRECTORIO ::= dir textop endDir CARPETA 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("DIRECTORIO",3, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // ESTRUCTURA ::= est DIRECTORIO endEst 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("ESTRUCTURA",2, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= ESTRUCTURA 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= INICIO ESTRUCTURA 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // START ::= INICIO 
            {
              Object RESULT =null;

              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("START",0, ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          return CUP$sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= START EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)).value;
		RESULT = start_val;
              CUP$sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintactico$stack.elementAt(CUP$sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintactico$parser.done_parsing();
          return CUP$sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

