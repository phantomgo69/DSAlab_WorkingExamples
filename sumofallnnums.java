public class SumNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Example value
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to sum
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}