import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingCounter extends JFrame {
	private static final long serialVersionUID = 36256321L;
	private JTextField txtCount;
	private JButton btnCount;
	
	public SwingCounter() {
		super("SwingCounter");
		super.setSize(400,100);
		super.setDefaultCloseOperation(3);//=or=>(EXIT_ON_CLOSE);
		
		//get Content Pane
		Container cp = super.getContentPane();
		cp.setLayout(new FlowLayout());
		
		//Create Object of each component
		this.txtCount = new JTextField("0",10);
		this.btnCount = new JButton("Count");
		
		//add object onto Content Pane(cp)
		cp.add(new JLabel ("Count : "));
		cp.add(this.txtCount);
		cp.add(this.btnCount);
		
		this.btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = txtCount.getText();
				int x = Integer.parseInt(str);
				x++;
				txtCount.setText(""+x);
			}
			
		});
		
		super.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingCounter();
			}
		});
		
		//new SwingCounter();//Create object using AWT's principle
	}

}
