package recursion;

public class prob6 {
    // to check if the array is shorted or not 
    public static void main(String[] args) {

        // taking a sorted array
        int arr[] = {1,2,3,4,5};
        System.out.println(checkSort(arr, 0));//i is started from the zeroth index as we have used the i +1 ; 
        
        
    }
    public static boolean checkSort(int[] arr, int i){
        // this is the sorting check in the ascending order.
        //base case
        if(i ==arr.length -1)
            return true ;

        // work
        if(arr[i]>arr[i+1])
            return false;

        //if( arr[i]<=arr[i+1])
            return checkSort(arr, i+1);


    }
    
}
