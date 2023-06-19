package recursion;

public class printing {
    public static void main(String[] args) {

        // this is a simple program that print number 12345 by using the recursion.
        print(1); // passing the value of n = 1 ; in the function

        
    }
    
public static void print(int n) {
    if(n== 5){
        System.out.println(5);
        return ; // if n = 5 then return to the previous 
    }
    System.out.println(n);// print the num that is given in the input.
    // again calling the same function by increasing the value by 1
    print(n+1);
    
}

    
}
