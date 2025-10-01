
import java.util.*;

public class Chicken_and_Cows {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        int ans = 0;

        while (Test_case-- > 0) {
            int input = sc.nextInt();
            if (input % 4 == 0) {
                ans = input / 4;
            } else {
                if ((input % 4) == 2 || (input % 4) == 3) {
                    ans = (input / 4) + 1;
                }
            }
            System.out.println(ans);

        }
        sc.close();
    }
}
