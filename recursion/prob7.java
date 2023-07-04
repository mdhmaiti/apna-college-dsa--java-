package recursion;

public class prob7 {
    //write a function to find the first occurence of an element inn an array. 
public static void main(String[] args) {
    int arr[] ={ 1,2,3,4,5,6,3,8};
    System.out.println(firstOccur(arr, 0, 12));
    
}
public static int firstOccur(int[] arr, int index,int num){
    // the logic is to check from the index 0 till the last index .


    // base conditon .: when the index i is on the last index or element of the array the conditon will terminate
    if( index ==arr.length  )// i am taking an extra iteration so that the last element is checked.

        return  -1 ;// if there is the last element then then it will move to the next phase.
        // if there is no element present then it will return the -1; 

    // function 
    if(arr[index]== num) // this returns the index at which the number is present.

    return index ;

    return firstOccur(arr, index+1, num); // this moves the number to the next index.


}
}
