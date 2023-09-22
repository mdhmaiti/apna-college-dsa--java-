
public class prob9 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println( power(2,5));
        

        
    }

    public static int power(int x, int n) {
        // when x = 0 , the ans should be 1 .
        if (n == 0) {
            return 1;
        }
        // i have to find the power i step below and just do the resursion.

        return x * power(x, n - 1);
    }
}
