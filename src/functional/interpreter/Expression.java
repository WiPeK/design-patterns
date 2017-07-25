package functional.interpreter;

import java.util.Stack;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public interface Expression {
    public void interpret(Stack<Integer> context);
}
