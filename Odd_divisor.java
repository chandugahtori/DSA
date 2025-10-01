import java.util.*;

public class Odd_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long number = sc.nextLong(); 

            if (number % 2 == 1) {
                System.out.println("YES");
            } else {
               
                while (number % 2 == 0) {
                    number /= 2;
                }
                if (number == 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
