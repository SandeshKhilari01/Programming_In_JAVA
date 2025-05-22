public class kadaneAlgo{
    public static void kadans(int numbs[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i= 0; i<numbs.length; i++){
            cs = cs + numbs[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max sum is: "+ms);
    }
    public static void main(String[] args) {
        int numbs[] = {-1,-3,5,2,3,7,-2};
        kadans(numbs);

    } 
}