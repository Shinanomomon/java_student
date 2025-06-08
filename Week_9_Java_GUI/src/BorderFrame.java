import java.awt.*;
public class BorderFrame  extends Frame{
	private static final long serialVersionUID =33456278L;
	private Button btnNorth, btnSouth, btnWest, btnEast, btnCenter;
	
	public BorderFrame() {
		super("BorderFrame");
		super.setSize(500, 350);
		
		//create Object of each component
		this.btnNorth = new Button("North");
		this.btnSouth = new Button("South");
		this.btnCenter = new Button("Center");
		this.btnWest = new Button("West");
		this.btnEast = new Button("East");
		
		// Set Border Layout for Frame
		super.setLayout(new BorderLayout());
		
		//Add component onto Frame
		//super.add(this.btnNorth, BorderLayout.NORTH);
		super.add(new Label("CED Border Frame",Label.CENTER), BorderLayout.NORTH);
		//super.add(this.btnSouth, BorderLayout.SOUTH);
		//super.add(this.btnEast, BorderLayout.EAST);
		//super.add(this.btnWest, BorderLayout.WEST);
		super.add(this.btnCenter, BorderLayout.CENTER);
		
		super.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderFrame();

	}

}
