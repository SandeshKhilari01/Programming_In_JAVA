
public class RevArr{
    public static void revArray(int numbs[]){
        int start = 0;
        int end = numbs.length - 1;
        while(start<end){
            int temp = numbs[start];
            numbs[start] = numbs[end];
            numbs[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
         int numbs[] = { 1,2,3,4,5,6};
         revArray(numbs);
        System.out.println("Array is reversed! ");
        for(int i = 0; i<numbs.length; i++){
            System.out.print(numbs[i] + "    ");
        }
        System.out.println(" ");
    }
} 