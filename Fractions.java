public class Fractions {
    // insatnce variables (attributes, fields)
    private int numerator, denominator;

    private void checkzero() {
        if (denominator == 0) {
            System.out.println("ERROR: Denominator cannot be zero.");
            denominator = 1;
        }
    }

    // constructors
    public Fractions() { // default constructor
        numerator = 1;
        denominator = 2;
    }

    public Fractions(int n, int d) { // parameterized constructor
        numerator = n;
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("ERROR: Denominator cannot be zero.");
        }
    }

    public Fractions(String s) {
        int a = s.indexOf("/");
        denominator = Integer.parseInt(s.substring(a + 1, s.length()));
        numerator = Integer.parseInt(s.substring(0, a));
        checkzero();
    }

    public Fractions(Fractions f) {
        denominator = f.getDenom();
        numerator = f.getNum();
    }

    // behaviour methods (accessor, mutator, helper)
    public int getNum() { // accessors (must be public)
        return numerator;
    }

    public int getDenom() { // accessor
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public void setNum(int n) { // mutator
        numerator = n;
    }

    public void setDenom(int d) { // mutator
        denominator = d;
        checkzero();
    }
}
