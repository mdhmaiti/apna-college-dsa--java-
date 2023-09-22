public class prob12 {
    public static void main(String[] args) {
        // Q . Remove duplicates in a string.
        String str = "appnacollege";
        removeDuplicates(str, 0, new StringBuilder("") ,new boolean[26]);
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        // base case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            //dulpicate
            removeDuplicates(str,idx+1,newStr,map);

        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    
    }}
