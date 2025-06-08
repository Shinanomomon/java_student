
public class Cmd123 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Usage: java CmdArith <num1> <Op> <num2>");
            System.err.println("Where num1 and num2 = double");
            System.err.println("- Op = Arithmetic Operations: ADD|SUB|MUL|DIV");
            return;
        }

        double num1, num2;
        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            String arg = e.getMessage().split(":")[0];
            int index = arg.equals(args[0]) ? 1 : 3;
            System.err.println("Invalid number format for argument " + index + ": " + arg);
            return;
        }

        String operator = args[1].toUpperCase();

        if (!operator.equals("ADD") && !operator.equals("SUB") && !operator.equals("MUL") && !operator.equals("DIV")) {
            System.err.println("Invalid operator: " + operator);
            System.err.println("Valid operators are: ADD, SUB, MUL, DIV");
            return;
        }

        double result;
        switch (operator) {
            case "ADD":
                result = num1 + num2;
                break;
            case "SUB":
                result = num1 - num2;
                break;
            case "MUL":
                result = num1 * num2;
                break;
            case "DIV":
                if (num2 == 0) {
                    System.err.println("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:

                return;
        }

        System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is: " + result);
    }
}
