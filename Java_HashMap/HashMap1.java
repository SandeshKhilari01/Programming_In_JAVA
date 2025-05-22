import java.util.HashMap;

public class HashMap1{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 2);
        map.put("Banana", 3);
        map.put("Carrot",4);
        map.put("Mango",2);
        map.put("Ananus",1);
        for(String fruit : map.keySet()){
            System.out.println(fruit);
        }
        System.out.println();
        for(Integer quantity : map.values()){
            System.out.println(quantity);
        }
        map.remove("Banana");
        //map.clear();
        for(String fruit : map.keySet()){
            System.out.println(fruit);
        }
        System.out.println();
        for(Integer quantity : map.values()){
            System.out.println(quantity);
        }
        boolean IsApple = map.containsKey("apple");
        System.out.println(IsApple);

        boolean IsValue = map.containsValue(2);
        System.out.println(IsValue);

        System.out.println(map.size());

        System.out.println(!map.isEmpty());

    }
}