import java.util.*;
public class leaders{
    public static void checkLeader(ArrayList<Integer>leaders){
        int n = leaders.size();
        for(int i = n-1; i>0; i--){
            boolean leader = true;
            for(int j = i+1 ; j<n; j++){
                if(leaders.get(i)>leaders.get(j)){
                    leader = false;
                }
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer>leaders = new ArrayList<>();
        leaders.add(10);
        leaders.add(20);
        leaders.add(1);
        leaders.add(40);
    }
}