package functional.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Krzysztof Adamczyk on 25.07.2017.
 */
public class ONP {
    public static void main(String[] args) {
        String expression = "42 4 2 - +";
        Stack<Integer> context = new Stack<>();

        List<Expression> parseTree = new ArrayList<>();
        for (String s : expression.split(" ")) {
            switch (s) {
                case "+":
                    parseTree.add(new Plus());
                    break;
                case "-":
                    parseTree.add(new Minus());
                    break;
                default:
                    parseTree.add(new NumberExpression(Integer.parseInt(s)));
                    break;
            }
        }
        parseTree.forEach(i -> {
            i.interpret(context);
        });
        System.out.println(context.pop());
    }
}
