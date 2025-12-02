// Problem-1.java
// Simple Calculator class that supports addition, subtraction, multiplication, division.
// File name kept as Problem-1.java; main class is Problem1 (not public).

class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() { return a + b; }
    public double sub() { return a - b; }
    public double mul() { return a * b; }
    public double div() {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class Problem1 {
    // Utility wrapper to choose operation string
    public static double calculate(double a, double b, String op) {
        Calculator calc = new Calculator(a, b);
        String o = op.trim().toLowerCase();
        switch (o) {
            case "add":
            case "+":
                return calc.add();
            case "sub":
            case "subtract":
            case "-":
                return calc.sub();
            case "mul":
            case "multiply":
            case "*":
                return calc.mul();
            case "div":
            case "divide":
            case "/":
                return calc.div();
            default:
                throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }

    public static void main(String[] args) {
        // Quick tests
        Object[][] tests = {
            {5.0, 2.0, "add"},
            {5.0, 2.0, "-"},
            {3.5, 2.0, "mul"},
            {10.0, 2.0, "/"}
        };
        for (Object[] t : tests) {
            double a = (double) t[0];
            double b = (double) t[1];
            String op = (String) t[2];
            System.out.println(a + " " + op + " " + b + " = " + calculate(a, b, op));
        }
    }
}
