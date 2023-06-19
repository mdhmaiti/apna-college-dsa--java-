package recursion;

public class fibonacciR {
    public static void main(String[] args) {
        // this is a program to a fibonacci number ;
        // this is a good starting of the recurssion concept;
        System.out.println(fibon(6));

    }

    public static int fibon(int n)
    {
        //base condition of fibonacci is : if the finon(1) the value is 1 and if the fibon(0) the number is 0;
        if (n < 2)
        {
            return n;
        }
        // now lets return the bsasic fibo concept
        return fibon(n-1) + fibon(n-2) ;
    }
    
}
