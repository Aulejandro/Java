public class MaxSubArrayProblem {
    record MaxSubArray(int maxLeft, int maxRight, int sum){}

    MaxSubArray findMaxCrossingSubarray(int[] A, int low, int mid, int high){

        int maxLeft = 0;
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = mid; i >= low; i--)
        {
            sum = sum + A[i];
            if (sum > leftSum);
            {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        int maxRight = 0;
        for(int j = mid +1; j <= high; j++)
        {
            sum = sum + A[j];
            if(sum > rightSum)
            {
                rightSum = sum;
                maxRight = j;
            }
        }
        return new MaxSubArray(maxLeft,maxRight,leftSum +rightSum);
    }
    MaxSubArray findMaxSubArray(int[] A, int low, int high){
        if (high == low) {
         return new MaxSubArray(low, high, A[low]);
        }
        else{
            int mid = (low+high)/2;
            MaxSubArray left = findMaxSubArray(A, low, mid);
            MaxSubArray right = findMaxSubArray(A,mid +1, high);
            MaxSubArray crossing = findMaxCrossingSubarray(A, low, mid, high);

            if(left.sum >= right.sum && left.sum >= crossing.sum)
                return left;
            else if (right.sum >= left.sum && right.sum >= crossing.sum)
                return right;
            else
                return crossing;
        }
    }

    public static void main(String args[]){
        System.out.println("Hello World");
        int[] change = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        MaxSubArrayProblem m = new MaxSubArrayProblem();
        MaxSubArray maxSubArray = m.findMaxSubArray(change, 0, change.length-1);
        System.out.println("Low: "+ maxSubArray.maxLeft+ " hight: "+ maxSubArray.maxRight+ " sum:"+ maxSubArray.sum);
    }
}
