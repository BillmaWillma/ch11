public class FractionDriver {
	
	public static void main(String[] args){
		Fractions f1 = new Fractions();
		Fractions f2 = new Fractions(6, 9);
		Fractions f3 = new Fractions("2/3");
		Fractions f4 = new Fractions(f2);
		 
		System.out.println(Fractions.div(f2, f3));
		System.out.println(Fractions.add(f2, f3));
		System.out.println(Fractions.min(f2, f3));
	}
}
