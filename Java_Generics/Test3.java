
import java.util.Arrays;



class Test3{
    public static void revArray(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static int maxElement(int arr[]){
        int maxElement = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void secondLargest(int arr[]){
        Arrays.sort(arr);
        int secondLar = arr[arr.length-2];
        System.out.println(secondLar);
    }

    public static void removeDuplicate(int arr[]){
        Arrays.sort(arr);
        int count = 0;
        for(int i = 1; i< arr.length; i++){
            if(arr[i] == arr[i-1]){
                arr[i] = 0;
                count++;
            }
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("All duplicate count are :"+ count);

    }

    public static void shiftZero(int arr[]){
        int n = arr.length;
        int idx = n - 1;
        int i = 0;
        while(i<idx){
            if(arr[i] == 0 && arr[idx]!=0){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                i++;
                idx--;
            } else if( arr[i] != 0 && arr[idx] !=0){
                i++;
            }
            else {
                idx--;
            }
        }
        for(int j = 0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,0,2,12,0,50,4,12,6,3,0};
        
        
        shiftZero(arr);
    }
}