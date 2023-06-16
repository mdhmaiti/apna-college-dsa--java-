//import java.util.Scanner;

import java.util.*;
public class stringbasics {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String str,str1,str2,str3;
        //note strings are immutable 
        //here are the two types of techniques to declare a string 
        str = "medhashis ";
        str1 = new String("maiti");
        System.out.println(str+" "+str1);
        System.out.println(" enter the value of string");
        Scanner sc = new Scanner(System.in);
        str2 = sc.next();
       
        Scanner sc1 = new Scanner(System.in);
        System.out.println(" enter another name");
        str3 = sc1.nextLine();
       
        System.out.println(str2);
        System.out.println(str3);
        sc.close();//sc.close() should be at the end of the program other wise it will not work( problem static and non static )
        sc1.close();
      //  System.out.println("closing scanner");
       // Scanner.close();
        // here is another method to input a string 
        /*import java.util.Scanner;    
public class ScannerCloseExample1{    
   public static void main(String args[]){    
    String s = "Hi All! This is JavaTpoint.";  
      //Create a scanner with the specified Object  
      Scanner scanner = new Scanner(s);  
      System.out.println("" + scanner.nextLine());  
      //Close the scanner  
      System.out.println("Closing Scanner...");  
      scanner.close();  
      System.out.println("Scanner Closed.");  
   }    
}      */

    }
}
