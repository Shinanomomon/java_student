/*
 * NAME:Khachaporn Lunthaiyo
 * ID:6502041620018
 * SECT:CED
 */
public class DeraException extends ArithmeticException {
    private static final long serislVersionUID = 565L;
    
    //property
    private String msg;
    
    //constructor
    public DeraException() { //Default Constructor
        super();	
    }
    public DeraException(String msg) { // Overloading Constructor
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