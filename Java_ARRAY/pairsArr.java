public class pairsArr{
    public static void printPairs(int numbs[]){
        int tp = 0;
        for(int i=0; i<numbs.length; i++){
            int curr = numbs[i];
            for(int j=i+1; j<numbs.length; j++){
                System.out.print("("+curr +"," + numbs[j]+") ");
                tp ++;
            }
            System.out.println("");
            
            
        }
        System.out.println("Total Pairs: "+tp);
    }
    public static void main(String[] args){
        int numbs[] = { 2,4,6,7,8,10};
        printPairs(numbs);
    }
}