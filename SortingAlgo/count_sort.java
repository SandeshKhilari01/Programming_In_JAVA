

public class count_sort{

    // public static void countingSort(int arr[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++){
    //         largest = Math.max(largest, arr[i]);
    //     }

    //     int c[] = new int[largest+1];
    //     for(int i=0; i<arr.length; i++){
    //         c[arr[i]]++;
    //     }

    //     // int j = 0;
    //     // for(int i=0; i<c.length; i++){
    //     //     while(c[i]>0){
    //     //         arr[j] = i;
    //     //         j++;
    //     //         c[i]--;
    //     //     }
    //     // }

    //     for(int i=0; i<c.length; i++){
    //         for(int j=0; j<c[i]; j++){
    //             arr[i]=i;
    //             c[i]--;
    //         }
    //     }
    // }
    

    public static void Count(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,4,2,7,2,8,3,3,1};
        Count(arr);
        printArray(arr);
    }
}
