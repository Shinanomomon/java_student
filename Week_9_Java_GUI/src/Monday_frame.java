import java.awt.Frame;//java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Monday_frame extends Frame implements WindowListener{
	private static final long serialVersionUID = 1239L;

	public Monday_frame() {
		super("Monday Frame");
		//super();
		///Super.setTitle("Monday Frame");
		
		this.addWindowListener(this);
		
		super.setSize(300,200);
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Monday_frame();
	}
	@Override
	public void windowOpened(WindowEvent e) { }
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);/*จำเป็น*/
		//this.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) { }

	@Override
	public void windowIconified(WindowEvent e){ }
	
	@Override
	public void windowDeiconified(WindowEvent e) { }

	@Override
	public void windowActivated(WindowEvent e) { }

	@Override
	public void windowDeactivated(WindowEvent e) {}

}
