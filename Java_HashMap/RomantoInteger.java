import java.util.*;
public class RomantoInteger{
    public static int romantoInt(String s){
        HashMap<Character, Integer> romanmap = new HashMap<>();
        romanmap.put('I',1);
        romanmap.put('V',5);
        romanmap.put('X',10);
        romanmap.put('L',50);
        romanmap.put('C',100);
        romanmap.put('D',500);
        romanmap.put('M',1000);

        int result = 0;
        
        for(int i = 0; i< s.length(); i++){
            int curVal = romanmap.get(s.charAt(i));
            if(i < s.length() - 1 && curVal < romanmap.get(s.charAt(i+1))){
                result -= curVal;
            } else {
                result += curVal;
            }
        }
        return result;
    }

    public static String intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i<values.length; i++){
            while(num>= values[i]){
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }
    

    public static void main(String[] args){
        String s = "I";
        int num = 102;
        int ans = romantoInt(s);
        String str = intToRoman(num);
        System.out.println(str);

    }
}