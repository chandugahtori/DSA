
public class pattern {


    // // with loop
    // public static void print_pattern(int n){
    //     for(int i = 0 ; i<n ; i++){
    //         for (int j = 0; j < i; j++) {                
    //             System.out.print("*" + " ");
    //         }
    //         System.out.println();
    //     }
    // }


    // with recursion 

    public static void print_pattern_recursion(int n){
        if(n ==0){
            return;
        }
        System.out.print("* ");
        print_pattern_recursion(n-1);
    }
    public static void main(String[] args) {
        int n = 6; 
        // print_pattern(n);
        print_pattern_recursion(n);
    }
}
