public class Interface{
    public interface Calculator{
       int calculate(int a, int b);
    }
    public static void main(String[] args){
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("The addition of a and b is: "+ addition.calculate(2,3));
        System.out.println("The multiplication of a and b is: "+multiplication.calculate(2,3));
    }
}