
import java.util.*;

public class Pattern_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n * 2][n * 2];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    int row = i / 2;
                    int col = j / 2;
                    if ( (row + col) % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();

            }
        }
        sc.close();
    }
}
