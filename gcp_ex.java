public class gcp_ex {
    public static int mygcd(int a, int b){
        while(a>0){
          int temp = a;
          a=b%a;
          b=temp;
        }
        return b;
      }
    public static void main(String[] args) {
        int a = 18;
        int b = 48;
       System.out.println(mygcd(a, b));
    }
}
