import java.util.*;
public class Heap{
  public static int kthSmallest(int nums[], int k){
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    for(int i = 0; i<nums.length; i++){
      maxHeap.offer(arr[i]);
      if(maxHeap>k){
      
      }
    }
  }
  public static void main(String args[]){
    int nums[] = {5, 6, 3, 8, 4, 9, 1};
    int k = 3;
    int ans = kthSmallest(nums, k);
    System.out.println(ans);
  }
}