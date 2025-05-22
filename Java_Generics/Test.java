
public class Test{
    public static void zeroSide(int arr[]){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,0,0,4,5,0};
        zeroSide(arr);
        print(arr);
    }
}