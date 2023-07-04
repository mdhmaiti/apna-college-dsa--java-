package recursion;

public class prob8 {
    public static void main(String[] args) {
        // this is a program to find the last occurance of a number inside the array .
        int arr[] = {1,2,3,4,5,6,5,7,8};
        System.out.println(lastOccur(arr, 0, 5));
        
    }

    public static int lastOccur(int[] arr ,int index,int num){
        //base condition
        if(index == arr.length)
            return -1;
        // function
        int isFound = lastOccur(arr, index +1, num)  ;
        if(isFound == -1 && arr[index] == num)
            return index;
        
        return isFound ;

    }
    
}
