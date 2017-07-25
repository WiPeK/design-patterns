package functional.interpreter;

import java.util.Stack;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class Minus implements Expression {
    @Override
    public void interpret(Stack<Integer> context) {
        context.push(-context.pop() + context.pop());

    }
}
