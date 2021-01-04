public class Fraction {
    private int numerator;
    private int denominator;

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    Fraction() {
        numerator = 1;
        denominator = 1;
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    Fraction reduce() {
        int m = gcd(numerator, denominator);
        Fraction y = new Fraction();
        y.denominator = denominator / m;
        y.numerator = numerator / m;
        if (y.denominator < 0 && y.numerator > 0) {
            y.denominator = -y.denominator;
            y.numerator = -y.numerator;
        }
        return y;
    }

    Fraction add(Fraction x) {
        Fraction y = new Fraction();
        y.numerator = numerator * x.denominator + x.numerator * denominator;
        y.denominator = x.denominator * denominator;
        return y.reduce();
    }

    Fraction subtract(Fraction x) {
        Fraction y = new Fraction();
        y.numerator = numerator * x.denominator - x.numerator * denominator;
        y.denominator = x.denominator * denominator;
        return y.reduce();
    }

    Fraction multiply(Fraction x) {
        Fraction y = new Fraction();
        y.numerator = numerator * x.numerator;
        y.denominator = denominator * x.denominator;
        return y.reduce();
    }

    Fraction divide(Fraction x) {
        if (x.numerator == 0) {
            return x;
        }
        Fraction y = new Fraction();
        y.numerator = numerator * x.denominator;
        y.denominator = denominator * x.numerator;
        return y.reduce();
    }

    /**
     * xac dinh so.
     *
     *
     * @param obj so nhap vao
     */

    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction y = (Fraction) obj;
            if (subtract(y).numerator == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
