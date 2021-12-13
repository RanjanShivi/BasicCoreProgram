import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number to count number of times the coin is flipped");
        int count_coin = sc.nextInt();
        int count_head = 0, count_tail = 0;
        double percent_head, percent_tail;
        for (int i = 0; i < count_coin; i++) {
            double coin_value = Math.random();
            System.out.println(coin_value);
            if (coin_value < 0.5) {
                System.out.println("TAIL");
                count_tail++;
            }
            else {
                System.out.println("HEAD");
                count_head++;
            }
        }
        System.out.println(count_head);
        System.out.println(count_tail);
        percent_head = (double) count_head / count_coin * 100;
        System.out.println("Perenctage of Head= " + percent_head);
        percent_tail = (double) count_tail / count_coin * 100;
        System.out.println("Perenctage of Tail= " + percent_tail);
    }
}
