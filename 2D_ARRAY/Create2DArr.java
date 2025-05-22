import java.util.*;
public class Create2DArr{

    public static boolean Search(int matrix[][], int key){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]== key){
                    System.out.print("Found at:("+i+", " +j+")");
                    return true;
                }
            }
        }
        System.out.print("Not Found");
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Search(matrix, 8);
    }
}
