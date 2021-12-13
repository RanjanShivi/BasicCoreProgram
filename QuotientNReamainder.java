import java.util.Scanner;

public class QuotientNReamainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend first then Divisor ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = quotient(dividend, divisor);
        System.out.println("The Quotient is = " + quotient);
        int remainder = remainder(dividend, divisor);
        System.out.println("The remainder is = " + remainder);
    }

    private static int remainder(int dividend, int divisor) {
        int remainder = dividend % divisor;
        return remainder;
    }

    private static int quotient(int dividend, int divisor) {
        int quotient = dividend / divisor;
        return quotient;
    }
}
