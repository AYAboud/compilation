/* Generated By:JavaCC: Do not edit this line. JsonParserConstants.java */
//package parseurjava;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface JsonParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int WHITESPACE = 1;
  /** RegularExpression Id. */
  int LBRACE = 2;
  /** RegularExpression Id. */
  int RBRACE = 3;
  /** RegularExpression Id. */
  int LBRACKET = 4;
  /** RegularExpression Id. */
  int RBRACKET = 5;
  /** RegularExpression Id. */
  int COLON = 6;
  /** RegularExpression Id. */
  int COMMA = 7;
  /** RegularExpression Id. */
  int TRUE = 8;
  /** RegularExpression Id. */
  int FALSE = 9;
  /** RegularExpression Id. */
  int NULL = 10;
  /** RegularExpression Id. */
  int DIGIT = 11;
  /** RegularExpression Id. */
  int NON_ZERO_DIGIT = 12;
  /** RegularExpression Id. */
  int NUMBER = 13;
  /** RegularExpression Id. */
  int STRING = 14;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<WHITESPACE>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\":\"",
    "\",\"",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "<DIGIT>",
    "<NON_ZERO_DIGIT>",
    "<NUMBER>",
    "<STRING>",
  };

}
