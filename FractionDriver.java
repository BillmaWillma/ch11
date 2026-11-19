public class FractionDriver {
	
	public static void main(String[] args){
		Fractions f1 = new Fractions();
		Fractions f2 = new Fractions(1, 2);
		Fractions f3 = new Fractions("1/3");
		Fractions f4 = new Fractions(f2);
		
		System.out.println(Fractions.mult(f2, f3));
	}
}
