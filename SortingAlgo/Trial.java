public class Trial{
    public static void main(String[] args){
        int arr[] = { 1,3,4,6,5};
        for(int i = 0; i < arr.length; i++){
            int lar = Integer.MIN_VALUE;
            if(arr[i]>lar){
                lar = arr[i];
                System.out.print(lar+" ");
            }
        }
        
    }
}