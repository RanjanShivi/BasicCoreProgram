import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max=0;
        if(num1>num2) {
            max=num1;
            if(num3>num1)
                max=num3;
            else
                max=num1;
        }
        else {
            max=num2;
            if(num3>num2)
                max=num3;
            else
                max=num2;
        }
        System.out.println("the largest number is = " + max);

    }
}
