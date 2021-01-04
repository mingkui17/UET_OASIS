public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression1) {
        this.expression = expression1;
    }

    @Override
    public String toString() {
        return '(' + expression.toString() + ") ^ 2";
    }

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}
