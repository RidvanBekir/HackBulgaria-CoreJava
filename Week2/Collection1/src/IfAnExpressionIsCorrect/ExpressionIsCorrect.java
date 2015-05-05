package IfAnExpressionIsCorrect;
public class ExpressionIsCorrect {

    public static void main(String[] args) {

        String str = new String("()()())))((())(");
        System.out.println("The expression is correct : " + isCorrect(str));

    }

    public static boolean isCorrect(String str) {
        int counter = 0;
        char[] strArray = str.toCharArray();
        if (strArray[0] != '(' || strArray[strArray.length - 1] != ')') {
            return false;
        }
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == '(')
                counter++;
            else
                counter--;
            if (counter < 0) {
                return false;
            }
        }
        if (counter != 0)
            return false;
        return true;
    }

}
