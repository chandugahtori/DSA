import java.util.*;
public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int q = n/5;
        int rem = n%5;
       
        if(rem < 5 && rem != 0){
            q +=1;
        }
        System.out.println(q);
        sc.close();
    }
}
