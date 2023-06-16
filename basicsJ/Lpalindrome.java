public class Lpalindrome {
  /*  public static String isPalindrome(String s) {
        String str = s.toLowerCase();
        String st3="";
        for(int i=0;i<str.length()/2;i++)
        {   
            char ch =str.charAt(i);
            if((Character.isLetterOrDigit(ch)==true) &&(ch != str.charAt(str.length()-1-i)) )
            System.out.println(" not palindrome");//not palindrome
            else if(Character.isLetterOrDigit(ch)==true)
            st2 +=ch;
        }
        System.out.println(st3);
        return st3;
        
    }*/ 
    public static String convert(String name){
        
        String st1 =name.toLowerCase();
        System.out.println(st1);
        int len = st1.length();
        String add ="";
        for(int i=0;i<len; i++)
        {
            char ch = st1.charAt(i);
            boolean b1=Character.isLetterOrDigit(ch);
            if (b1 == true)
            add += ch;

        }
        return add;

    }
    public static boolean isPalindrome(String s)
    {
         int n= s.length();
        for( int i =0; i<n/2;i++){
            if(s.charAt(i)!= s.charAt(n-1-i))
            return false;
        }

        return true;
    }
    public static boolean opPalindrome(String s){
        String st1 =s.toLowerCase();
        System.out.println(st1);
        int len = st1.length();
        int i;
        //String add ="";
         for(i =0;i<len;i++) 
        {  
            char ch = st1.charAt(i);
            boolean b1=Character.isLetterOrDigit(ch);
            if( (b1 == true)&&(st1.charAt(i)== st1.charAt(len-1-i)))
            return true ;

        

        }
    
        return true;
    }
    public static void main(String[] args) {
        String st2 = " A man, a plan, a canal: Panama";
        String st5 = " race a car";
       /* *String st1 =st2.toLowerCase();
        System.out.println(st1);
        int len = st1.length();
        String add ="";
        for(int i=0;i<len; i++)
        {
            char ch = st1.charAt(i);
            boolean b1=Character.isLetterOrDigit(ch);
            if (b1 == true)
            add += ch;

        }
        System.out.println(add);*/
        
        System.out.println(convert(st2));
        System.out.println(isPalindrome(convert(st5)));
        System.out.println(opPalindrome(st5));
        
        
    }
    
}
