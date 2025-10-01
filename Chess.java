import java.util.*;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        char[] column = {'a','b','c','d','e','f','g','h'};
        int[] rows = {1,2,3,4,5,6,7,8};

        while (t-- > 0) {
            String positon = sc.next();
            char first_place = positon.charAt(0);  
            int second_place = positon.charAt(1) - '0'; 

           
            for (int i = 0; i < rows.length; i++) {
                if (column[i] != first_place) {
                    System.out.print(" " + column[i] + second_place);
                }
            }
            System.out.println();
            for (int i = 0; i < rows.length; i++) {
                if (rows[i] != second_place) {
                    System.out.print(" " + first_place + rows[i]);
                }
            }
        }
        sc.close();
    }
}
