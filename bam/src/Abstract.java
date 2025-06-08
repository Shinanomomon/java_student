/*
 name : Khachaporn Lunthaiyo
 ID : 6502041620018
 Sect : CED 1 DERA
*/
import java.lang.Math;

public class Abstract implements IArith {
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	@Override
	public int multiply(int x, int y) {
		return Math.multiplyExact(x, y);
	}

	@Override
	public double divide(double x,double y) {
		double dX = Math.abs(x);
		double dY = Math.abs(y);
		return (dX/dY)+(dX%dY);
	}

}
