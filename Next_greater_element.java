import java.util.*;

class Next_greater_element {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = n-1 ; i>=0; i--){
            while(s.size() >0 &&  arr[i] >= s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                result.add(-1);
            }else{
                result.add(s.peek());
            }
            
            s.push(arr[i]);
            
        }
            Collections.reverse(result);

    return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        System.out.println(nextLargerElement(arr));
    }
}
