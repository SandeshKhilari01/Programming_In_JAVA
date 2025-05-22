import java.util.*;
public class subString{
    public static void Sub(String str, int si, int ei){
        System.out.println("The String is: ");
        for(int i = si; i<=ei; i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";
        System.out.println("Enter Starting Index");
        int si = sc.nextInt();
        System.out.println("Enter Ending Index");
        int ei = sc.nextInt();
        Sub(str, si, ei);
        System.out.println();
        System.out.println(str.substring(0,4));
    }
}