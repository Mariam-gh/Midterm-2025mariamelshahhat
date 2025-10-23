public class factorialcalculator {
    public static void main(String[] args) {
        int num =6;  // Predefined number to calculate factorial //change int from 5 to 6 in Mariam's branch
        int factorial = 1;

        for (int i = 1; i <= num; i++) { // Loop through numbers
            factorial *= i;  // Multiply current number
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
