public class diagonalArraySum {
    public static int digArrSum(int arrmatrix[][])
    { int sum =0;
        for(int i=0;i<arrmatrix.length;i++ )// row 
        {
            for(int j=0;j<arrmatrix[0].length;j++)// column
            {
                //primary diagonal
                if(i==j)
                sum +=arrmatrix[i][j];
                /// secondary diagonal
                else if (i+j == arrmatrix.length-1)
                sum += arrmatrix[i][j];


            }
        }
        return sum;
    }

    public static int opDigArrSum(int arrmatrix[][]){
        int sum = 0;
        for(int i = 0;i<arrmatrix.length;i++){
            //primary diagonal
            sum+= arrmatrix[i][i];
            //secondary diagonal
            if(i!=arrmatrix.length -1-i)//it is the necessary step sp that the the middle element does not repeat in 3X3 matrix
            sum+=arrmatrix[i][arrmatrix.length-1-i];//simple math : i+j = n -1 ;where n is the order of matrix, therefor j= n-1-i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arrmatrix[][] ={{1,2,3,4},
                            {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(digArrSum(arrmatrix));//this has a complexity of O(n^2)
        System.out.println("optimized technique ans is "+opDigArrSum(arrmatrix));// complexity O(n)
    }
    
}
