
class Except {
    public static void divides(int x, int y){
        int z = x/y;
        System.out.println(z);
        // System.out.println("Exception message: "+ throwable.getMessage());
        // throwable.printStackTrace();

        // System.out.println("Description of Exception!"+
        // throwable.toString());
    }

    public static int divide(int m , int n){
        // try {
        //     int p = m/n;
        //     System.out.println(p);
        // }
        // catch(ArithmeticException ex) {
        //     System.out.println("The divisor should not be zero");
        // }
        int z = m/n;
        return z;

    }

    public static void Divide(int m, int n) {
        try {
            int z = m/n;
            System.out.println(z);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        } catch (ArithmeticException e) {
            System.out.println("The divisor should not be zero");
        } 
        System.out.println("Method execution ends");
    }
    public int cube (int n){
        return n*n*n;
    }

    public static void Divides(int x, int y){
        try {
            if(y==0)
            throw new Exception("The divisor should not be zero!");
            int z = x/y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Divides(10,0);
        // try {
        //     divide(10,0);
        // } catch (ArithmeticException exception) {
        //     System.out.println(exception);
        // } finally {
        //     System.out.println("Inside Finally!");
        // }
        // Except tc = new Except();
        // int num = Integer.parseInt(args[0]);
        // System.out.println(tc.cube(num));
        
    }
}