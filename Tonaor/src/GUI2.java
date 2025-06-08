/*
 * Name : Sasitorn Krathaytong
 * ID : 6502041620131
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class GUI2 extends Frame implements ActionListener, WindowListener {

 private static final long serialVersionUID = 4568946L;
 private Button btn1,btn2,btn3,btn4 ;
 private TextField txt1,txt2,txt3 ;
 private double x1,x2,result = 0;
 
 
 public GUI2()
 {
  super("Calculator");
  this.addWindowListener(this);
  
  
  this.setLayout(new GridLayout(5, 2));
 
  
  this.btn1 = new Button("+");
  this.btn2 = new Button("-");
  this.btn3 = new Button("*");
  this.btn4 = new Button("/");
  this.txt1 = new TextField("0",10);
  this.txt2 = new TextField("0",10);
  this.txt3 = new TextField("0",10);
  
  
  this.add(new Label("number1 : "));
  this.add(this.txt3);
  this.add(new Label("number2 : "));
  this.add(this.txt1);
  this.add(new Label("Result : "));
  this.add(this.txt2);
  this.add(this.btn1);
  this.add(this.btn2);
  this.add(this.btn3);
  this.add(this.btn4);
 
  
  this.txt2.setEditable ( false );
  this.txt1.setText("");
  this.txt3.setText("");
  this.txt2.setText("");
  

  this.btn1.addActionListener(this) ;
  this.btn2.addActionListener(this) ;
  this.btn3.addActionListener(this) ;
  this.btn4.addActionListener(this) ;
  

  this.setTitle("Calculator");
  this.setSize(300,200);
  this.setVisible(true);
  
 }

 

 //@Override
 public void windowOpened(WindowEvent e) {}
 public void windowClosing(WindowEvent e) {
  System.exit(0);
  }
 public void windowClosed(WindowEvent e) {}
 public void windowIconified(WindowEvent e) {}
 public void windowDeiconified(WindowEvent e) {}
 public void windowActivated(WindowEvent e) {}
 public void windowDeactivated(WindowEvent e) {}
 public void actionPerformed(ActionEvent e) {
  String cmd = e.getActionCommand();
  x1 = Integer.parseInt(txt3.getText());
  x2 = Integer.parseInt(txt1.getText());
  if(cmd=="+") {
      result = x1 + x2 ;
      txt2.setText(Double.toString(result));
  } else if(cmd=="-") {
      result = x1 - x2;
      txt2.setText(Double.toString(result));
  } else if(cmd=="*") {
      result = x1 * x2;
      txt2.setText(Double.toString(result));
  } else if(cmd=="/") {
      if (x2 == 0) {
          txt2.setText("Cannot divide by zero");
      } else {
          result = x1 / x2;
          txt2.setText(Double.toString(result));
      }
  }
 }
 //main
 public static void main(String[] args) 
 {
  new GUI2();
 }
}