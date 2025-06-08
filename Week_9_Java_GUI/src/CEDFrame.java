import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class CEDFrame extends java.awt.Frame  implements WindowListener{///act///, ActionListener///act/// /*public class CEDFrame extends java.awt.Frame //dont used import. */ {
	private static final long serialVersionUID = 1L;
	//private Label  lblCED;
	private TextField txtCount;
	private Button btnCount;   // increment
	private Button btnDec;   // Decrement
	/*public CEDFrame() {
	super("CED Frame");//super.setTitle("CED Frame");
	super.setSize(400,200);
	super.setVisible(true);
}*/
	public CEDFrame(String title) {
		super(title);//super.setTitle("CED Frame");
		super.setSize(300,100);
		
//create Object of component
		this.txtCount = new TextField("0", 10);
		this.btnCount = new Button("+");
		this.btnDec = new Button("-");
		//this.lblCED = new Label("Count : ");
		
//set Layout (FlowLayout)
		//FlowLayout fl = new FlowLayout();
		//super.setLayout(fl);
		super.setLayout(new FlowLayout());//(FlowLayout.CENTER, 10 ,20));
		
//Add object of component onto Frame
		//super.add(this.lblCED);
		super.add(new Label("Count : "));
		super.add(this.txtCount);
		super.add(this.btnCount);
		super.add(this.btnDec);
		
		// Add xxx Listener
		///act///this.btnCount.addActionListener(this);
		///act///this.btnDec.addActionListener(this);
		this.addWindowListener(this);
		this.btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtCount.getText());
				x++;
				txtCount.setText(x+"");
			} 
		});//Obj of ActionListener
		this.btnDec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtCount.getText());
				x--;
				txtCount.setText(x+"");
			}
		});
		super.setVisible(true);
	}

/*///act///
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//System.out.println("Botton is Clicked!!!");
		String str = this.txtCount.getText();
		
		int x = Integer.parseInt(str); //str = 20;
		
		if(cmd.equals("+"))
			x++;
		if(cmd.equals("-"))
			x--;
		this.txtCount.setText(x+"");
		
		//this.txtCount.setText(++x +"");//(String.valueOf(x));
		//this.txtCount.setText("" + ++x);

	}*////act///
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);	
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

public static void main(String[] args) {
	new CEDFrame("CEDFrame (Main)");
	//CEDFrame cf = new CEDFrame();

	}
}