
import java.util.*;
public class all_empty {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int test_case  = sc.nextInt();


        while (test_case-- >0) {
            int len = sc.nextInt();
            int [] arr = new int[len];

            for (int i = 0; i < len; i++) {
               arr[i] = sc.nextInt();
            }

            int total_blank_space = 0;
            int new_blank_space = 0;

            for (int i = 0; i < arr.length; i++) {


                if(arr[i] == 0){
                    new_blank_space++;
                    total_blank_space = Math.max(total_blank_space, new_blank_space);
                }else{
                    new_blank_space = 0;
                }
                
            }
            System.out.println(total_blank_space);
            
            
        }
        sc.close();
    }
}
