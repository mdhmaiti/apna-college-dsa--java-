import java.util.*;

public class stringbasics2 {
    public static void printLetters(String str1){//i can pass any value of string through str1
        for(int i = 0;i< str1.length();i++){
            System.out.print(str1.charAt(i)+" ");
        }
        System.out.println();
    }
    /**
     * @param args
     */
    // TO CHECK IF THE NUMBER IS PALINDROME
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))//== and return true korla loop beshi khn chobe 
            return false;//time beshi lagbe tai not equals to and false kora beria aschi 
            
        }
        
        return true;
    }
    public static String substringx(String strxx,int si,int ei )
    {
        String stradd ="";
    for (int i =si;i<ei; i++)
    stradd+= strxx.charAt(i);
    return stradd;
    }

    /**
     * @param name1
     * @return
     */
   // public static String compareString(String name1,String name2,String name3){
       
    //    if( name1 == name2 )
    //    System.out.println("same name ");
      //  else 
      //  System.out.println(" diffent name ");
     //   if(name1 == name3)
     //   System.out.println("same name ");
      //  else 
      //  System.out.println(" diffent name ");
      //  if (name1.equals(name3))
     //   System.out.println("same name ");
     //   else 
      //  System.out.println(" diffent name ");

    
        
   // }

    public static void main(String[] args) {
        //input from the user
        System.out.println(" enter the letters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printLetters(str);
       System.out.println( isPalindrome(str));
       //str1 akta string chilo jar moddhe ami str pass koracchi
      
        sc.close();//it is like a=b; b=c; therefore a=c;
       // this to show the comparison of strings 
       
        System.out.println(substringx("hellowworld", 0, 5));// process to print a substring
        String name1 ="medha";
        
        String name2 ="medha";
        String name3= new String("medha");
        if( name1 == name2 )
      System.out.println("same name ");
       else 
      System.out.println(" diffent name ");
        if(name1 == name3)// IT WILL GIVE ANS AS DIFFERENT NAME 
        System.out.println("same name ");
        else 
       System.out.println(" diffent name ");
        if (name1.equals(name3))// I SHOULD ALWAYS USE THIS METHOD TO COMPARE THE STRINGS 
       System.out.println("same name ");
       else 
       System.out.println(" diffent name ");

        
        
    }
  
    /*  public static void main(String[] args) {
        isPalindrome("it works");
    }*/
    
}
