package Calculator;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public void run() {

        System.out.println("Hello!\nOnly works with correct expressions!");
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!(input.equals("exit"))) {
            System.out.println();
            System.out.print("Enter expression :> ");
            input = sc.nextLine();
            calculateExpression(input);
        }
        sc.close();
        System.out.println("Bye!");

    }

    private static void calculateExpression(String input) {
        input = ShuntingYard.shuntingYard(input).replaceAll("\\s+", "");
        String[] tokens = input.split("(?!^)");
        Stack<String> stack = new Stack<String>();
        final String ops = "-+/*^";

        for (String token : tokens) {
            if (ops.contains(token) == false) {
                stack.push(token);
            } else {
                Double d1 = Double.valueOf(stack.pop());
                Double d2 = Double.valueOf(stack.pop());

                Double result = token.compareTo("^") == 0 ? Math.pow(d1, d2) : token.compareTo("*") == 0 ? d1 * d2
                        : token.compareTo("/") == 0 ? d1 / d2 : token.compareTo("+") == 0 ? d1 + d2 : d1 - d2;
                stack.push(String.valueOf(result));
            }
        }
        System.out.println(Double.valueOf(stack.pop()));
    }
}
