public class FractionDriver {
	
	public static void main(String[] args){
		Fractions f1 = new Fractions();
		Fractions f2 = new Fractions(1, 2);
		
		System.out.println(f1.getNum() + "/" + f1.getDenom());
		System.out.println(f2.getNum()+ "/" + f2.getDenom());
	}
}
