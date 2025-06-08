import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.*==all==> java.awt
public class GridFrame extends Frame  {
	private static final long serialVersionUID = 2L;
	private Button btnLogin;
	private TextField txtUser, txtPass;
	public GridFrame() {
		super("Frame with GridLayout");
		super.setSize(250,165);

		// Add GridLayout to Frame
		super.setLayout(new GridLayout(3, 2, 10, 10));
		
		//Create objects of components
		this.txtUser = new TextField();
		this.txtPass = new TextField();
		this.btnLogin = new Button("Login");
		this.txtPass.setEchoChar('*');
		// Add each component onto Frame
		super.add(new Label("User: ",Label.RIGHT));
		super.add(this.txtUser);
		super.add(new Label("Pass: ", 2));
		super.add(this.txtPass);
		super.add(new Label());
		super.add(this.btnLogin);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridFrame();
	}

}
