public class PathCal{
    public static void Cal(String str){
        int n = str.length();
        int x = 0;
        int y = 0;
        System.out.print("Path is : ");
        for(int i=0; i<=n-1; i++){
            System.out.print(str.charAt(i)+" ");
            if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='S'){
                y--;
            }else if(str.charAt(i)=='E'){
                x++;
            }else if(str.charAt(i)=='W'){
                x--;
            }
        }
        System.out.println();
        int X = x*x;
        int Y = y*y;
        int sum = X + Y;
        System.out.println("X is = "+x);
        System.out.println("Y is = "+y);
        System.out.println("Distance from origin = "+Math.sqrt(sum));
    }
    public static void main(String[] args) {
        String str = ("WNEENESENNN");
        Cal(str);
    }
}