import java.util.*;
class MinHeap{
  private ArrayList<Integer> heap;
  public MinHeap(){
    heap = new ArrayList<>();
  }
  public void insert(int value){
    heap.add(value);
    heapifyUp(heap.size()-1);
  }
  public int extract(){
    if(heap.isEmpty()){
      throw new IllegalStateException("Heap is Empty");
    }
    if(heap.size() == 1){
      return heap.remove(0);
    }
    int root = heap.get(0);
    heap.set(0, heap.remove(heap.size()-1));
    heapifyDown(0);
    return root;
  }
  private void heapifyUp(int index){
    while(index>0){
      int parentIndex = (index - 1)/2;
      if(heap.get(index) < heap.get(parentIndex)){
        swap(index, parentIndex);
        index = parentIndex;
      } else {
        break;
      }
    }
  }
  private void heapifyDown(int index){
    int size = heap.size();
    while(index<size){
      int leftChild = 2 * index + 1;
      int rightChild = 2 * index + 2;
      int smallest = index;
      
      if(leftChild < size && heap.get(leftChild) < heap.get(smallest)){
        smallest = leftChild;
      }
      if(rightChild < size && heap.get(rightChild) < heap.get(smallest)){
        smallest = rightChild;
      }
      if(smallest != index){
        swap(index, smallest);
        index = smallest;
      } else {
        break;
      }
    }
  }
  public void swap(int i, int j){
    int temp = heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j, temp);
  }
  public void display(){
    System.out.println(heap);
  }
}

public class MinHeapExample{
  public static void main(String args[]){
    MinHeap minHeap = new MinHeap();
    minHeap.insert(10);
    minHeap.insert(20);
    minHeap.insert(5);
    minHeap.insert(30);
    
    System.out.println();
    
    minHeap.display();
    minHeap.extract();
    System.out.println();
    minHeap.display();
  }
}