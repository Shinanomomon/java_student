/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
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
	private static final long serialVersionUID =326536782736L;
	private JButton btn0, btn1,  btn2, btn3;
	private TextField txtnumber1, txtnumber2, txtResult;
	private TextArea taDisplay;
	private double num1,num2,result =0;
	public Calculator() {
		super("Calculator");
		super.setSize(450,250);
		
		this.btn0 = new JButton("+");
		this.btn1 = new JButton("-");
		this.btn2 = new JButton("*");
		this.btn3 = new JButton("/");
		this.txtnumber1 = new TextField("",20);
		this.txtnumber2= new TextField("",20);
		this.txtResult = new TextField(20);
		this.taDisplay = new TextArea(5, 40);
		
		Panel paneltxt = new Panel(new GridLayout(3, 2));
		paneltxt.add(new Label("Number: "));
		
		paneltxt.add(this.txtnumber1);
		paneltxt.add(new Label("Number: "));
		paneltxt.add(this.txtnumber2);
		paneltxt.add(new Label("Result: "));
		paneltxt.add(this.txtResult);

		Panel panelButton = new Panel(new GridLayout(2, 2));
		panelButton.add(this.btn0);
		panelButton.add(this.btn1);
		panelButton.add(this.btn2);
		panelButton.add(this.btn3);
		
		this.txtResult.setEditable(false);
		this.taDisplay.setEditable(false);
		this.btn0.addActionListener(this) ;
		this.btn1.addActionListener(this) ;
		this.btn2.addActionListener(this) ;
		this.btn3.addActionListener(this) ;
		
		addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);  // Terminate the program
	         }
	      });
		setBackground(Color.GRAY);
		  
		this.btn0.setBackground(Color.PINK);
		this.btn1.setBackground(Color.PINK);
		this.btn2.setBackground(Color.PINK);
		this.btn3.setBackground(Color.PINK);
		this.txtnumber1.setBackground(Color.LIGHT_GRAY);
		this.txtnumber2.setBackground(Color.LIGHT_GRAY);
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
	num1 = Double.parseDouble(this.txtnumber1.getText());
	num2 = Double.parseDouble(this.txtnumber2.getText());

	if(cal == "+") {
			this.taDisplay.setForeground(Color.WHITE);
		   this.result = this.num1 + this.num2 ;
		   this.txtResult.setText(""+result);
		   this.taDisplay.append(this.num1 + " + " + this.num2 +" = " + this.result + "\n"); 
		}
	else if(cal == "-") {
			this.taDisplay.setForeground(Color.WHITE);
		   this.result = this.num1 - this.num2;
		   this.txtResult.setText(""+result);
		   this.taDisplay.append(this.num1 + " - " + this.num2 +" = " + this.result + "\n");  
		}
	else if(cal == "*") {
			this.taDisplay.setForeground(Color.WHITE);
		   this.result = this.num1 * this.num2;
		   this.txtResult.setText(""+result);
		   this.taDisplay.append(this.num1 + " x " + this.num2 +" = " + this.result + "\n"); 
		}
	else if(cal == "/") {
			this.taDisplay.setForeground(Color.WHITE);
			  if(num2 == 0) {this.taDisplay.setForeground(Color.RED);
				  this.taDisplay.append("EER : Division must not by zero\n"); }
			  else{result =this.num1 / this.num2;
			  		this.txtResult.setText(""+result);
			  		this.taDisplay.append(this.num1 + " / " + this.num2 +" = " + this.result + "\n"); 
			  	  }
		}
	}
	catch(NumberFormatException r) {
		
		this.taDisplay.setForeground(Color.RED);
		this.taDisplay.append(""+r);
		 this.taDisplay.append("\nNumber : ____ ==> You must input number.\n"); 
	}
	catch(Exception r) {
		this.taDisplay.setForeground(Color.RED);
		 this.taDisplay.append("Number : ____ ==> You must input number.\n"); 
	}
	}
	public static void main(String[] args) {
		new Calculator();

	}
}


