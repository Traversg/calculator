import java.util.Scanner;

public class App {

    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String stringInput = inputScanner.nextLine();
        return stringInput;
    }

    private static double getDouble(String prompt){
        System.out.println(prompt);
        double doubleInput = inputScanner.nextDouble();
        inputScanner.nextLine();
        return doubleInput;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        String exit = "";
        while (exit.equals("")){
            String optionMenu = getString("What would you like to do?\nadd\nsubtract\nmultiply\ndivide\nexit").toLowerCase();
            if (optionMenu.equals("add")){
                double num1 = getDouble("Please enter the first number: ");
                double num2 = getDouble("Please enter the second number: ");
                double addResult = calculator.add(num1, num2);
                System.out.println("Result: " + addResult);
            }
            if (optionMenu.equals("subtract")){
                double num1 = getDouble("Please enter the first number: ");
                double num2 = getDouble("Please enter the second number: ");
                double subtractResult = calculator.subtract(num1, num2);
                System.out.println("Result: " + subtractResult);
            }
            if (optionMenu.equals("multiply")){
                double num1 = getDouble("Please enter the first number: ");
                double num2 = getDouble("Please enter the second number: ");
                double multiplyResult = calculator.multiply(num1, num2);
                System.out.println("Result: " + multiplyResult);
            }
            if (optionMenu.equals("divide")){
                double num1 = getDouble("Please enter the first number: ");
                double num2 = getDouble("Please enter the second number: ");
                if (num2 == 0){
                    System.out.println("Please divide by a number other than zero");
                    num2 = getDouble("Please enter the second number: ");
                }
                double divideResult = calculator.divide(num1, num2);
                System.out.println("Result: " + divideResult);
            }
            if (optionMenu.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            
        }
    }
}