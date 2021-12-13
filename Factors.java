import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to find prime factor");
        int num = sc.nextInt();
        for(int i = 2; i<num/2; i++) {
            while(num%i == 0) {
                System.out.println(i);
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println(num);
        }
    }
}
