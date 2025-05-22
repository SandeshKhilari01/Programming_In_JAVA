public class binarySearchAlgo{
    public static int binarySearch(int numbs[],int key) {
        int start = 0;
        int end = numbs.length-1;

        //comparisons
        while(start<=end){
            int mid = (start+end)/2;

            //comparison
            if(numbs[mid] == key){
                return mid;
            }
            if(numbs[mid]>key){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int numbs[] = {1, 3, 6, 2, 4, 5, 2, 8, 16};
       int key = 8;
       System.out.println("Index for the key is: " + binarySearch(numbs,key));
    }
}