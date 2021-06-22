public class PostfixEvaluation {
    public static void main(String[] args) {
        System.out.println("Testing Postfix Evaluation:");
        System.out.println("2 3 + 4 * 5 - = " + evaluatePostfix("2 3 + 4 * 5 -"));
        
    }
    public static double evaluatePostfix(String postfix) {
        Stack<Double> valueStack = new Stack<>();
        String[] tokens = postfix.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                valueStack.push(Double.valueOf(token));
            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")) {
                Double operandTwo = valueStack.pop();
                Double operandOne = valueStack.pop();
                Double result = compute(operandOne, operandTwo, token);
                valueStack.push(result);
            }
        }
        return valueStack.peek();
    }

    public static boolean isNumeric(String token) {
        try {
            double d = Double.parseDouble(token);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Double compute(Double operandOne,Double operandTwo, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = operandOne + operandTwo;    
                break;

            case "-":
                result = operandOne - operandTwo;
                break;

            case "*":
                result = operandOne * operandTwo;
                break;

            case "/":
                result = operandOne / operandTwo;
                break;

            case "^":
                result = Math.pow(operandOne, operandTwo);
                break;
                
            default:
                result = 0;
                break;
        }
        return result;
    }
}
