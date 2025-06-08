/*
 *Name : Poranat Tonthakaew
import java.util.Scanner;
*/
public class DeraException extends ArithmeticException {
private static final long serislVersionUID = 522525463565L;
    
    //property
    private String msg;
    
    //constructor
    public DeraException() { 
        super();	
    }
    public DeraException(String msg) { 
        super();
        this.msg = msg;
    }
    
    //setter
    public void setMsg(String msg) { 
        this.msg = msg;
    }
    //Getter
    public String getMsg() {
        return this.msg;
    }

}
