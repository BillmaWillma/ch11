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

    public static Fractions mult(Fractions a, Fractions b) {
        int denominator = a.getDenom() * b.getDenom();
        int numerator = a.getNum() * b.getNum();
        Fractions ans = new Fractions(numerator, denominator);
        return reduce(ans);
    }

    public static Fractions div(Fractions a, Fractions b) {
        int denominator = a.getDenom() / b.getDenom();
        int numerator = a.getNum() / b.getNum();
        Fractions ans = new Fractions(numerator, denominator);
        return reduce(ans);
    }

    public static Fractions add(Fractions a, Fractions b) {
        int denominator = a.getDenom() * b.getDenom();
        int na = a.getNum() * b.getDenom();
        int nb = b.getNum() * a.getDenom();
        Fractions ans = new Fractions(na + nb, denominator);
        return reduce(ans);
    }

    public static Fractions min(Fractions a, Fractions b) {
        int denominator = a.getDenom() * b.getDenom();
        int na = a.getNum() * b.getDenom();
        int nb = b.getNum() * a.getDenom();
        Fractions ans = new Fractions(na - nb, denominator);
        return reduce(ans);
    }

    public static Fractions reduce(Fractions a) {
		int numerator = a.getNum()/gcm(a);
		int denominator = a.getDenom()/gcm(a);
        Fractions ans = new Fractions(numerator, denominator);
        return ans;
    }

    public static int gcm(Fractions a) {
      int num = a.getNum();
      int denom = a.getDenom();
        while (num != denom) {
            if (num > denom) {
                num = num - denom;
            } else {
                denom = denom - num;
            }
        }

        return num;
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
