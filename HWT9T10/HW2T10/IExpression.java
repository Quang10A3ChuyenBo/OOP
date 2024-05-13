import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    @Test
public interface IExpression {
    int evaluate();
    String toString();
}

class Numeral implements IExpression {
    private int value;

    public Numeral(int value) {
        this.value = value;
    }

    public int evaluate() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}

class BinaryExpression implements IExpression {
    private int leftOperand;
    private String operator;
    private int rightOperand;

    public BinaryExpression(int leftOperand, String operator, int rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public int evaluate() {
        if (operator.equals("+")) {
            return leftOperand + rightOperand;
        } else if (operator.equals("-")) {
            return leftOperand - rightOperand;
        } else if (operator.equals("*")) {
            return leftOperand * rightOperand;
        } else {
            // Handle other operators here
            return 0;
        }
    }

    public String toString() {
        return "(" + leftOperand + " " + operator + " " + rightOperand + ")";
    }
}

class Square implements IExpression {
    private IExpression expression;

    public Square(IExpression expression) {
        this.expression = expression;
    }

    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    public String toString() {
        return "(" + expression.toString() + ")^2";
    }
}
