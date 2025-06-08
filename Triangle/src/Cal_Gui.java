/*
 *Name : Poranat Tonthakaew
 *ID : 6502041610021 
 *Sect : CED 1 DERA
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Cal_Gui extends Frame implements ActionListener{
	private static final long serialVersionUID =326536782736L;
	private JButton volume, surfaceArea;
	private TextField txtwidth, txtheight, txtdepth, txtResult;
	private TextArea taDisplay;
	private double width,height,depth,result =0;
	public Cal_Gui() {
		super("Calculator");
		super.setSize(450,350);
		
		this.volume = new JButton("volume");
		this.surfaceArea = new JButton("surfaceArea");
		this.txtwidth = new TextField("",20);
		this.txtheight= new TextField("",20);
		this.txtdepth= new TextField("",20);
		this.txtResult = new TextField(20);
		this.taDisplay = new TextArea(5, 40);
		
		Panel paneltxt = new Panel(new GridLayout(4, 2));
		paneltxt.add(new Label("Width: "));
		paneltxt.add(this.txtwidth);
		paneltxt.add(new Label("Height: "));
		paneltxt.add(this.txtheight);
		paneltxt.add(new Label("Depth: "));
		paneltxt.add(this.txtdepth);
		paneltxt.add(new Label("Result: "));
		paneltxt.add(this.txtResult);

		Panel panelButton = new Panel(new GridLayout(2, 1));
		panelButton.add(this.volume);
		panelButton.add(this.surfaceArea);

		
		this.txtResult.setEditable(false);
		this.taDisplay.setEditable(false);
		this.volume.addActionListener(this) ;
		this.surfaceArea.addActionListener(this) ;
		
		addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);  // Terminate the program
	         }
	      });
		setBackground(Color.GRAY);
		  
		this.volume.setBackground(Color.PINK);
		this.surfaceArea.setBackground(Color.PINK);
		this.txtwidth.setBackground(Color.LIGHT_GRAY);
		this.txtheight.setBackground(Color.LIGHT_GRAY);
		this.txtdepth.setBackground(Color.LIGHT_GRAY);
		this.txtResult.setBackground(Color.LIGHT_GRAY);
		this.taDisplay.setBackground(Color.black);
		this.taDisplay.setForeground(Color.WHITE);
		
		super.add(paneltxt, BorderLayout.NORTH);
		super.add(panelButton, BorderLayout.CENTER);
		super.add((taDisplay), BorderLayout.SOUTH);
		super.add(new Label(""), BorderLayout.EAST);
		super.add(new Label(""), BorderLayout.WEST);
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	String cal = e.getActionCommand();
	try {
		width = Double.parseDouble(this.txtwidth.getText());
		height = Double.parseDouble(this.txtheight.getText());
		depth = Double.parseDouble(this.txtdepth.getText());

	if(cal == "volume") {
			this.taDisplay.setForeground(Color.WHITE);
		   this.result = this.width * this.height * this.depth ;
		   this.txtResult.setText(""+result);
		   this.taDisplay.append("volume of square = " + this.result + "\n"); 
		}
	else if(cal == "surfaceArea") {
		 	this.taDisplay.setForeground(Color.WHITE);
		   this.result = ((this.width * this.height) * 2) + ((this.depth * this.height) * 4);
		   this.txtResult.setText(""+result);
		   this.taDisplay.append("surfaceArea of square= " + this.result + "\n");  
	}
	}
	catch(NumberFormatException r) {
		
		this.taDisplay.setForeground(Color.RED);
		this.taDisplay.append(""+r);
		 this.taDisplay.append("\nWidth : ____ ==> You must input number.\n"); 
		 this.taDisplay.append("\nHeight : ____ ==> You must input number.\n"); 
		 this.taDisplay.append("\nDepth : ____ ==> You must input number.\n"); 
	}
	catch(Exception r) {
		this.taDisplay.setForeground(Color.RED);
		 this.taDisplay.append("\nWidth : ____ ==> You must input number.\n"); 
		 this.taDisplay.append("\nHeight : ____ ==> You must input number.\n"); 
		 this.taDisplay.append("\nDepth : ____ ==> You must input number.\n");
	}
	}
	public static void main(String[] args) {
		new Cal_Gui();

	}
}


