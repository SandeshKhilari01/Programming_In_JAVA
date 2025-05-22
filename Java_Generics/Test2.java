
import java.util.*;
public class Test2{
    public static void removeDuplicate(int arr[]){
        ArrayList list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        } 
        
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 5, 4, 3};
        
        removeDuplicate(arr);
        
    }
}