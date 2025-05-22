public class Test1{
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,3,6};
        // Arrays.sort(arr);
        for(int j = 0; j<arr.length; j++){
            for(int k = j; k<arr.length; k++){
                if(arr[j] > arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}