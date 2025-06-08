/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
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

public class Calculator extends Frame implements ActionListener{
	private static final long serialVersionUID =3261525L;
	private JButton volume, surfaceArea;
	private TextField TXTWidth, TXTHeight, TXTDepth, TXTResult;
	private TextArea TXTDisplay;
	private double width,height,depth,result =0;
	public Calculator() {
		super("Calculator");
		super.setSize(450,350);
		
		this.volume = new JButton("volume");
		this.surfaceArea = new JButton("surfaceArea");
		this.TXTWidth = new TextField("",10);
		this.TXTHeight= new TextField("",10);
		this.TXTDepth= new TextField("",10);
		this.TXTResult = new TextField(20);
		this.TXTDisplay = new TextArea(5, 40);
		
		Panel panelTXT = new Panel(new GridLayout(4, 2));
		panelTXT.add(new Label("Width: "));
		panelTXT.add(this.TXTWidth);
		panelTXT.add(new Label("Height: "));
		panelTXT.add(this.TXTHeight);
		panelTXT.add(new Label("Depth: "));
		panelTXT.add(this.TXTDepth);
		panelTXT.add(new Label("Result: "));
		panelTXT.add(this.TXTResult);

		Panel panelButton = new Panel(new GridLayout(1, 2));
		panelButton.add(this.volume);
		panelButton.add(this.surfaceArea);

		
		this.TXTResult.setEditable(false);
		this.TXTDisplay.setEditable(false);
		this.volume.addActionListener(this) ;
		this.surfaceArea.addActionListener(this) ;
		
		addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0); 
	         }
	      });
		setBackground(Color.orange);
		  
		this.volume.setBackground(Color.red);
		this.surfaceArea.setBackground(Color.GREEN);
		this.TXTWidth.setBackground(Color.YELLOW);
		this.TXTHeight.setBackground(Color.YELLOW);
		this.TXTDepth.setBackground(Color.YELLOW);
		this.TXTResult.setBackground(Color.cyan);
		this.TXTDisplay.setBackground(Color.black);
		this.TXTDisplay.setForeground(Color.green);
		
		super.add(panelTXT, BorderLayout.NORTH);
		super.add(panelButton, BorderLayout.CENTER);
		super.add((TXTDisplay), BorderLayout.SOUTH);
		super.add(new Label(""), BorderLayout.EAST);
		super.add(new Label(""), BorderLayout.WEST);
		super.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	String cal = e.getActionCommand();
	try {
		width = Double.parseDouble(this.TXTWidth.getText());
		height = Double.parseDouble(this.TXTHeight.getText());
		depth = Double.parseDouble(this.TXTDepth.getText());

	if(cal == "volume") {
			this.TXTDisplay.setForeground(Color.green);
		   this.result = this.width * this.height * this.depth ;
		   this.TXTResult.setText(""+result);
		   this.TXTDisplay.append("volume = " + this.result + "\n"); 
		}
	else if(cal == "surfaceArea") {
		 	this.TXTDisplay.setForeground(Color.green);
		 	this.result = ((this.width * this.height) * 2) + ((this.depth * this.height) * 4);
		 	this.TXTResult.setText(""+result);
		 	this.TXTDisplay.append("surfaceArea = " + this.result + "\n");  
	}
	}
	catch(NumberFormatException r) {
		
		this.TXTDisplay.setForeground(Color.RED);
		this.TXTDisplay.append(""+r);
		 this.TXTDisplay.append("\nWidth :  --> You must input Number.\n"); 
		 this.TXTDisplay.append("\nHeight :  --> You must input Number.\n"); 
		 this.TXTDisplay.append("\nDepth : --> You must input Number.\n"); 
	}
	catch(Exception r) {
		this.TXTDisplay.setForeground(Color.RED);
		 this.TXTDisplay.append("\nWidth : --> You must input Number.\n"); 
		 this.TXTDisplay.append("\nHeight : --> You must input Number.\n"); 
		 this.TXTDisplay.append("\nDepth :  --> You must input Number.\n");
		}
	}
	public static void main(String[] args) {
		new Calculator();

	}
}


