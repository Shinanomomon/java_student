
public abstract class Abst  {
	protected String gen;
	public Abst() {
		this.gen = "";	
	}
	public Abst(String gen) {
		super();
		this.gen = gen;	
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getGen() {
		return gen;
	}
	public void Scheduling() {
		System.out.println("Uniprocessor Scheduling : "+ this.gen);
	}
	public abstract void Turnaround_Time();; 
	public abstract void Average_Turnaround_Time(); 
	public abstract void Waiting_Time();
	public abstract void Average_Waiting_Time();
	public void Turnaround_Time(int[] arrival_time, int[] service_time) {
		// TODO Auto-generated method stub
		
	}
	public void Waiting_Time(int[] arrival_time, int[] service_time) {
		// TODO Auto-generated method stub
		
	}
	public void Average_Turnaround_Time(int[] arrival_time, int[] service_time) {
		// TODO Auto-generated method stub
		
	}
	public void Average_Waiting_Time(int[] arrival_time, int[] service_time) {
		// TODO Auto-generated method stub
		
	}
	
}
