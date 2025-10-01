
import java.util.*;

public class Quality_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int resp = sc.nextInt();
            int ans_Index = -1;
            int ans_quality = -1;
            for (int i = 1; i <= resp; i++) {
                int words = sc.nextInt();
                int quality = sc.nextInt();
                if (words <= 10 && quality > ans_quality) {
                    ans_quality = quality;
                    ans_Index = i;

                }
            }
            System.out.println(ans_Index);
        }
        sc.close();
    }
}
