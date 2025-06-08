import java.awt.*;
public class MondayFrame2 extends Frame{
	private static long serialVersionUID =298352L; 
	public MondayFrame2() {
		super("Monday 2");
		
		//Add WindowListener
		
		//MondayHandler mh = new MondayHandler();
		//this.addWindowListener(mh);//or//
		this.addWindowListener(new MondayHandler());
		
		
		super.setSize(600, 400);
		super.setVisible(true);
	}
	public static void main (String[] args) {
		new MondayFrame2();
	}

}
