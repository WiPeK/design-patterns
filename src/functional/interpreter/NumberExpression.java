package functional.interpreter;

import java.util.Stack;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class NumberExpression implements Expression {
    private int variable;

    public NumberExpression(int variable) {
        this.variable = variable;
    }

    @Override
    public void interpret(Stack<Integer> context) {
        context.add(this.variable);
    }
}
