public class StringCampar{    
    public static void main(String[] args){
        String str1 = ("Hello");
        String str2 = new String("Hello");
        String str3 = ("Hello");
        if(str1.equals(str2) && str1 == str3){
            System.out.println("Both string are equal.");
        } else {
            System.out.println("String are not equal.");
        }
    }
}