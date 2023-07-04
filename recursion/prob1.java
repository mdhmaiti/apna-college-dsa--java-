package recursion;

public class prob1 {
    
    public static void main(String[] args) {
        // this is a program to print the numbers in the decreasing order using recursion.
        int n = 10;// print till 10
        printDec(n);
    }
    public static void printDec(int n) {
        // base condition 
        if (n == 1){
            System.out.println(n); // this prints 1;
            return ; // return to the previous value.

        }
        // actual fuctionality
        System.out.println(n);
        // recursion : call the function
        printDec(n-1);
    }
}
