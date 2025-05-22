// Checked Exception
// ClassNotFoundException => No definition of class is found
// IOException => I/O operation is interrupt of failed
// NoSuchMethodException => thrown method is not found
// InterruptedException => if a thread is sleeping waiting or otherwise occupied and it is interrupted then this exception is thrown
// IllegalAccessException => if the method doesn't have access to the zero-argument constructor or class then this exception is thrown

// Unchecked Exception
// ArithmeticException => Error occured in arithmetic statements such as division by zero
// ArrayIndexOutOfBoundsException => Array Index is negative or greator than array size
// NullPointerException => if an Object with null value is used to access data
// ClassCastException => When invalid casting is done


// class Exceptions {
//     // public static void divide (int x, int y) throw Exception {
//     //     if(y==0)
//     //     throw new Exception("The divisor should not be zero!");
//     //     int z = x/y;
//     //     System.out.println(z);
//     // }
//     public static void main(String[] args){
//         // try {
//         //     divide(10,0);
//         // } catch(Exception e){
//         //     System.out.println(e.getMessage());
//         // }
//     }
// }

// 


// class Exceptions{
//     public static void divide(int x, int y) throws Exception {
//        if(y == 0)
//             throw new Exception("The divisor should not be zero");
//        int z = x/y;
//        System.out.println(z);
// }
// public static void main(String[] args) {
//        try {
//            divide(10, 0); 
//        }
//        catch(Exception e) {
//            System.out.println(e.getMessage()); 
//        }
// }
// }
class MyDivException extends Exception 
{ 
    public MyDivException(String message) {
        super(message);
    }
}

class Tester
{
    public static void divide(int x, int y) throws MyDivException {
        if(y == 0)
           throw new MyDivException("The divisor should not be zero");
        int z = x/y;
            System.out.println(z);
    }
    
    public static void main(String[] args)
    {
        try
        {
        divide(6,0);
        }catch(MyDivException e) {
            System.out.println(e.getMessage());
        }
    }
}
