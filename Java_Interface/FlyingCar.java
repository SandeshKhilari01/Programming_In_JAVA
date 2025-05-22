
// Creating class
    public class FlyingCar implements Flyable, Drivable{
        public void fly(){
           System.out.println("Flying mode on!");
        }
        public void drive(){
           System.out.println("Driving mode on!");
        }

        public static void main(String[] args){
        FlyingCar Car = new FlyingCar();
        Car.drive();
        Car.fly();
        }
    }