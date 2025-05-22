public class LarInArr{
    public static int getLargest(int numbs[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; //-Infinity
        for(int i=0; i<numbs.length;i++){
            if(largest < numbs[i]){
                largest = numbs[i];
            } 
            if(smallest > numbs[i]){
                smallest = numbs[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
        return largest;
    }
    public static void main(String[] args){
        int[] numbs = { 1, 3, 6, 2, 5};
        System.out.println("Largest value in the array is: " + getLargest(numbs));
    }
}