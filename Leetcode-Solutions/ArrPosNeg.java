import java.util.*;
public class ArrPosNeg{
    public static int[] Arrange(int[] arr){
        if(arr == null){
            return null;
        }
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            } else   {
                pos.add(arr[i]);
            }
        }
        int n = arr.length;
        int[] ans = new int[n];
        int posIdx = 0;
        int negIdx = 1;
        for (int num : arr){
            if(num >=0){
                ans[posIdx] = num;
                posIdx += 2;
            } else {
                ans[negIdx] = num;
                negIdx += 2;
            }
        }
        return ans;
    //     ArrayList<Integer> pos = new ArrayList<>();
    //     ArrayList<Integer> neg = new ArrayList<>();
    //     for(int i = 0; i< arr.length; i++){
    //         if(arr[i] < 0){
    //             neg.add(arr[i]);
    //         } else   {
    //             pos.add(arr[i]);
    //         }
    //     }
    //     var ans = new int[arr.length];
    //     for(int i = 0; i < arr.length; i++){
    //         ans[2*i] = pos.get(i);
    //         ans[2*i+1] = neg.get(i);
    //     }
    //     return ans;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,-3,-4};
        int[] result = Arrange(arr);
        System.out.println(Arrays.toString(result));
    }
}