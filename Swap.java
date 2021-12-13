import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before Swap- \n num1 = " + num1 + "\n num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swap- \n num1 = " + num1 + "\n num2 = " + num2);
    }
}
