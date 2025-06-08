import java.awt.*;

public class CEDCalc extends Frame {
	private static final long serialVersionUID =326536782736L;
	private Button btn0,btn1,  btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;
	private TextField txtResult;
	public CEDCalc() {
		super("CED Calculator");
		super.setSize(200,200);
		
		//Create Object for each button
		this.btn0 = new Button("0");
		this.btn1 = new Button("1");
		this.btn2 = new Button("2");
		this.btn3 = new Button("3");
		this.btn4 = new Button("4");
		this.btn5 = new Button("5");
		this.btn6 = new Button("6");
		this.btn7 = new Button("7");
		this.btn8 = new Button("8");
		this.btn9 = new Button("9");
		this.btn10 = new Button("*");
		this.btn11 = new Button("#");
		this.txtResult = new TextField("0",20);
		
		//create Panel of buttons
		Panel panelButton =new Panel(new GridLayout(4, 3));
		panelButton.add(this.btn0);
		panelButton.add(this.btn1);
		panelButton.add(this.btn2);
		panelButton.add(this.btn3);
		panelButton.add(this.btn4);
		panelButton.add(this.btn5);
		panelButton.add(this.btn6);
		panelButton.add(this.btn7);
		panelButton.add(this.btn8);
		panelButton.add(this.btn9);
		panelButton.add(this.btn10);
		panelButton.add(this.btn11);
		
		//set Layout for Frame (BorderLayout)
		super.setLayout(new BorderLayout());
		
		//Add Components onto Frame
		super.add(this.txtResult, BorderLayout.NORTH);
		super.add(panelButton, BorderLayout.CENTER);
		
		super.setVisible(true);
	}

	public static void main(String[] args) {
		new CEDCalc();

	}

}
