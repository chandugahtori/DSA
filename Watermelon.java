
import java.util.*;
public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        
        if(weight > 2  && weight % 2 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sc.close();  
    }
}
