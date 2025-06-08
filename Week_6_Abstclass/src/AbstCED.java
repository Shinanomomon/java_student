/*
 *Name :Naphaphon Klaimanee
 *ID : 6502041610080 
 */
public abstract class AbstCED {
	protected String gen;
	
	public AbstCED() {
		super();//call Constructor's superclass//ไม่จำเป็น
		this.gen = "CED#11";	
	}
	public AbstCED(String gen) {
		super();
		this.gen = gen;	
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getGen() {
		return gen;
	}
	public void aboutMe() {
		System.out.println("We are "+ this.gen);
	}
	public abstract void study(); 
	public abstract void eat(); 
	public abstract void sleep(); 
}
