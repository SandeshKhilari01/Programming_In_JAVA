public class PrintSubArr{
    public static void printSubArr(int numbs[]){
        int ts = 0;
        int max = 0;
        for(int i=0; i<numbs.length; i++){
            int start = i;
            for(int j=i;j<numbs.length;j++){
                int end = j;
                int subarrsum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbs[k]+" ");
                    subarrsum += numbs[k];
                }
                System.out.println(" ");
                System.out.println("Sum of numbers in subarray is: "+subarrsum);
                if(subarrsum > max){
                    max = subarrsum;
                }
                System.out.println();
                ts++;

            }
            System.out.println();
        }
        System.out.println("Max sum is : "+max);
        System.out.println("Total Subarrays: "+ts);

    }
    public static void main(String[] args) {
        int numbs[]= { 2,4,6,8,10};
        printSubArr(numbs);
    } 
}