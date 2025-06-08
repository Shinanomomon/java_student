
public class ExceptionOutput {

  public static void main( String args[] ) {
    try {
      int testInt = Integer.parseInt("abc");
    }
    catch ( NumberFormatException e ) {
      System.err.println();
      System.err.println("Output of getMessage():");
      System.err.println("--------------");
      System.err.println( e.getMessage() );
      System.err.println();
      System.err.println("Output of toString():");
      System.err.println("-------------");
      System.err.println( e.toString() );
      System.err.println();
      System.err.println("Here's the stack trace:");
      System.out.println("-----------");
      e.printStackTrace();
    }
  }
}
