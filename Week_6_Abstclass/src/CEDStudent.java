
public class CEDStudent extends AbstCED{

	public CEDStudent() {
		super();	
	}
	public CEDStudent(String gen) {
		super(gen);
	}
	
	@Override
	public void study() {
		System.out.println("CED Students study very hard.");
	} 

	@Override
	public void eat() {
		System.out.println("CED Students study eat like an elephant.");	
	}

	@Override
	public void sleep() {
		System.out.println("We sleep all day long.");		
	}
}
