
public class TestArg {
	public static void main(String[] args) {
		int n = args.length;
		
		if(n==0) {
			System.err.println("Argument cannot be empty.");
			System.exit(0);
		}
		System.out.println("n = " + n);
		for(int i=0;i<args.length; i++) {
			System.out.println(args[i]);//length());
		}
		
		//System.out.println("n = " + n);
		//System.out.println("n = ".concat(n+""));
		
	}
}
