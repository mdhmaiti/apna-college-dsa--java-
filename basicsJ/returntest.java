public class returntest{
    // TO CHECK IF THE NUMBER IS PALINDROME
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))//== and return true korla loop beshi khn chobe 
            return false;//time beshi lagbe tai not equals to and false kora beria aschi 
            
        }
        //System.out.println("hhhhh");
        return true;
    }
    public static void main(String[] args) {//main ar jaigai onno kichu likhla hoi na 
        String str ="racecar";
        System.out.println(isPalindrome(str));
    }
  
    
}
