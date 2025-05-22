import java.util.*;
public class minDiff{
    public static void main(String args[]){
        int arr1[] = {2, 1, 3};
        int arr2[] = {1, 3, 2};


        int minD = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<arr1.length; i++){
            minD = Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(minD);
    }
}