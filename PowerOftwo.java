import java.util.Scanner;

public class PowerOftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for maximum power of 2");
        int n = sc.nextInt();
        if(n<=0 || n>=31) {
            System.out.println("Wrong choice\n Enter another number greater than 0 and less than 31");
            n = sc.nextInt();
        }
        for(int i=1; i<=n; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^"+i+"=" + result);
        }
    }
}
