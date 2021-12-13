import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for maximum value");
        int n = sc.nextInt();
        if(n==0) {
            System.out.println("Do not enter 0\n Enter again");
            n = sc.nextInt();
        }
        double sum=0, harmonic_val=1;
        System.out.print("Harmonic Value = ");
        for(int i=1; i<=n; i++) {
            harmonic_val = (double) 1/ i;
            if(i==n)
                System.out.println(harmonic_val);
            else
                System.out.print(harmonic_val + "+");
            sum += harmonic_val;
        }
        System.out.println("\n Sum of harmonic value = " + sum );
    }
}
