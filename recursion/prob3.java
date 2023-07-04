package recursion;

public class prob3 {
    // this is a program to print the factorial of n .
    public static void main(String[] args) {
        // to print the factorial we need the n! = n * (n-1)!
        int n = 5 ;
        System.out.println(fact(n)); 

    }
    public static int fact(int n)
    {
        // defining the base case 
        if(n == 0 ){
            return 1 ;
        
        }
        int fn = n * fact(n -1);
        return fn;//after the execution the return takes the function to the previous state .
        
    }
    
}
