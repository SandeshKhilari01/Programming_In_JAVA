public class LarString{
    public static void main(String[] args) {
        String arr[] = {"Hello","World","How","Are","You?"};
        String Largest = arr[0];
        for(int i=0; i<=arr.length-1;i++){
            if(arr[i].length()>Largest.length()){
                Largest = arr[i];
            }
        }
        System.out.println("The largest string is: "+Largest);
    }
}