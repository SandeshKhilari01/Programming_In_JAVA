public class MissingNum {
    public static int findMissingNum(int[] arr, int n) {
        int flag;
        for (int i = 0; i < n; i++) {
            flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 7}; 
        int n = arr.length;  
        System.out.println(findMissingNum(arr, n));
    }
}