public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return left.toString() + "/" + right.toString();
    }

    @Override
    public double evaluate() {
        double result = 0;
        try {
            result = left.evaluate() / right.evaluate();
            return result;
        } catch (Exception e) {
            System.out.print("Lỗi chia cho 0");
        }
        return result;
    }
}
