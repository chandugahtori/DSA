
import java.util.*;
public class Sublime_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test_case = sc.nextInt();
        while (Test_case-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            if(n%2 == 0){
                System.out.println(0);
            }else{
                System.out.println(x);
            }
        }
        sc.close();
    }   
}
