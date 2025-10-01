import java.util.*;

public class Following_Directions {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            int n = sc.nextInt();   
            String s = sc.next();  

            int x = 0, y = 0;
            boolean found = false;

            for (int i = 0; i < n; i++) {
                char move = s.charAt(i);

                if (move == 'U') y++;
                else if (move == 'D') y--;
                else if (move == 'L') x--;
                else if (move == 'R') x++;

                if (x == 1 && y == 1) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}
