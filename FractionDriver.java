public class FractionDriver {
	
	public static void main(String[] args){
		Fractions f1 = new Fractions();
		Fractions f2 = new Fractions(1, 2);
		Fractions f3 = new Fractions("1/2");
		Fractions f4 = new Fractions(f2);
		
		System.out.println(f1.getNum() + "/" + f1.getDenom());
		System.out.println(f2.getNum()+ "/" + f2.getDenom());
		System.out.println(f3.getNum() + "/" + f3.getDenom());
		System.out.println(f4.getNum() + "/" + f4.getDenom());
		System.out.println(f4);
		System.out.println(f4.toDouble());
	}
}
