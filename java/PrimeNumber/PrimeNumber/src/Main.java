public class Main {

    public static boolean isPrime(int number) {
        // Prime numbers must be greater than 1
        if (number <= 1) {
            return false;
        }

        // Check divisibility from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Number is divisible by i, so it's not prime
            }
        }

        return true;  // No divisors found, so the number is prime
    }

    public static void main(String[] args) {
        // Test the isPrime function
        int number = 29;  // Change this value to test other numbers

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
