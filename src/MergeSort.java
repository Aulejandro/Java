public class MergeSort {

    void merge(int[] A, int p, int q, int r){

        //System.out.println("In Merge p = "+p+ " q = "+q+ " r = "+r );
        int n1 = q-p+1;
        int n2 = r-q;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for(int i= 1; i<= n1; i++)
            L[i-1] = A[p+i-1];

        for(int j = 1; j <= n2; j++)
            R[j-1] = A[q+j];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int j = 0;
        int i = 0;

        for(int k = p; k<= r; k++){
            if(L[i]<=R[j]) {
                A[k] = L[i];
                i++;
            }
            else{
                A[k] = R[j];
                j++;
            }

        }


    }
    void mergeSort(int[] A,int p, int r){
        //System.out.println("p = "+p + " r = "+r);
        if (p<r){
            // calculate midpoint
            int q = (p+r)/2;
            //System.out.println("p = "+p + " q = "+q + " r = "+r);
            // divide left side in half
            mergeSort(A, p, q);
            // divide right side into second half
            mergeSort(A, q+1, r);
            // merge together
            merge(A,p,q,r);

        }
    }

    public static void main(String[] args){

        //System.out.println("\n Hello world from merge sort!");

        MergeSort m = new MergeSort();

        int[] A = {5,8,2,1,19,16,1,500,784,23,66,65,-1,-900};
        for(int i = 0; i < A.length; i++)
            System.out.print(A[i]+" ");
        System.out.println();

        m.mergeSort(A, 0, A.length-1);

        for(int i = 0; i < A.length; i++)
            System.out.print(A[i]+" ");
        System.out.println();

    }
}
