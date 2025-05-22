class NextPermutation {
    public void nextPermutation(int[] A) {
        int ind = -1;
        int n = A.length;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(A, 0, n - 1);
            return;
        }

        int minGreater = Integer.MAX_VALUE;
        int minGreaterIndex = -1;
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind] && A[i] < minGreater) {
                minGreater = A[i];
                minGreaterIndex = i;
            }
        }
        swap(A, ind, minGreaterIndex);
        reverse(A, ind + 1, n - 1);
    }

    private void reverse(int[] A, int start, int end) {
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void printArr(int [] A){
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String[] args){
        int A[] = {2,1,5,4,0,0,3};
        NextPermutation solution = new NextPermutation();
        solution.nextPermutation(A);
        printArr(A);
    }
}
