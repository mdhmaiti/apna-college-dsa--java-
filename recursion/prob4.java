package recursion;

public class prob4 {
    public static void main(String[] args) {
        //print the sum of the first m natural numbers using the recursion .
        int n = 10 ;
        System.out.println(sum(n));
    }
        
     public static int sum(int n){
        int s = 0;

        // base conditon
        if(n==1){
        return 1 ;
        }

      // function condition 
        s= n + sum(n-1);
        
        
        return s;
     }
    
}
