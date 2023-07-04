package recursion;
import java.util.Arrays;
public class binarySr {
    public static void main(String[] args) {

        // now testing the function that i have written 
        int [] arr = {1,2,3,4,5,6,56,75,100,};
        
        Arrays.sort(arr);// binary search is not applicable for the unsorted arrays ;; the logic it self turns wrong 
        int target = 5;
        System.out.println(search(arr,target,0,arr.length-1));
        
    }

    public static int search(int[] arr,int target , int s , int e){
        if (s>e) {
            return -1 ; // this indicates there is an error 
        }
        int m = s + (e-s)/2; // this is the most efficient formulae to calculate  the middle point (potential integration overflow)
        
        // checking for the middle ; if the target is in the middle
        if( arr[m]== target){
            return m;
        }
        
        // cheching if the target is in the lest hand side of the arr 
        if( arr[m]> target ) {
            return search(arr, target, s,  m-1) ;

        } 
         // checking if the element is in the right side of the array
        //  if(arr[m]< target)
        //  {                       actually this id condition is not needed ;
        //     return search(arr, target, m+1, e);
        //  }

        return search(arr, target, m+1, e);
}

}