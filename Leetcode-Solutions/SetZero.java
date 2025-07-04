
import java.util.*; 
public class SetZero{
    public static void markRow(ArrayList<ArrayList<Integer>> matrix, int m, int n, int i){
        for(int j = 0; j<m; j++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }  
    }
    public static void markCol(ArrayList<ArrayList<Integer>> matrix, int m , int n, int j){
        for(int i = 0; i<n; i++){
            if(matrix.get(i).get(j)!=0){
                matrix.get(i).set(j,-1);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> SetZero(ArrayList<ArrayList<Integer>>matrix, int m, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j)==0){
                    markRow(matrix,n,m,i);
                    markCol(matrix,n,m,j);
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix.get(i).get(j)==-1){
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n = matrix.size();
        int m = matrix.get(0).size();
        SetZero(matrix,3,3);
        for(int i = 0; i<matrix.size(); i++){
            for(int j = 0; j<matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
