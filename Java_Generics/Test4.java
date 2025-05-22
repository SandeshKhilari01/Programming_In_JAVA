import java.util.*;
public class Test4{
    public static void removeOddRepeat(int arr[]){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 1; i<n; i++){
        //     if(arr[i] % 2 != 0 && arr[i-1] % 2 != 0){
        //         arr[i] = 0;
        //     }
        // }
       
        // for(int j = 0; j<n; j++){
        //     System.out.print(arr[j]+" ");
        // }

        list.add(arr[0]);
        for(int i = 1; i<n ; i++){
            if(!(arr[i]%2 != 0 && arr[i-1]%2 !=0)){
                list.add(arr[i]);
            } 
        }
        int i = 0;
        while(i < list.size()){
            System.out.print(list.get(i)+" ");
            i++;
        }
    }
    public static void main(String[] args){
        int[] arr = {123, 12, 125,127,144,135};
        removeOddRepeat(arr);
    }
}