

public class createString{
    public static void FindChar(String str){
        for(int i=0; i<=str.length()-1; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        String str = ("SYSTEM");
        String str1 = ("I Love");
        String str2 = (" My India!");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(str2));
        System.out.println(str.charAt(2));
        System.out.println();
        FindChar(str);
    }
}