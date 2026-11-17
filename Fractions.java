public class Fractions {
    // insatnce variables (attributes, fields)
    private int numerator, denominator;

    // constructors
    public Fractions() { // default constructor
        numerator = 1;
        denominator = 1;
    }

    public Fractions(int n, int d) { // parameterized constructor
        numerator = n;
        denominator = d;
    }

    // behaviour methods (accessor, mutator, helper)
    public int getNum() { // accessor
        return numerator;
    }
    public int getDenom() { // accessor
        return denominator;
    }
}
