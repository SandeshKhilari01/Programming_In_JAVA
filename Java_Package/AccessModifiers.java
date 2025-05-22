class Person {
    private int salary = 5000;
    public String name = "Jack";
    protected int age = 23;
    String email = "jack@gmail.com";
    public void display(){
       System.out.println("Name: "+name);
       System.out.println("Age: "+age);
       System.out.println("Email: "+email);
       System.out.println("Salary: "+salary);
    }
}
class Employee extends Person {
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);
    }
}
class Customer {
    public void display(){
        Person p = new Person();
        System.out.println("Name: "+p.name);
        System.out.println("Age: "+p.age);
        System.out.println("Email: " + p.email);
    }
}
class Execute {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Customer c = new Customer();
        p.display();
        System.out.println("Person class display");
        System.out.println(" ");
        e.display();
        System.out.println("Employee class display");
        System.out.println(" ");
        c.display();
        System.out.println("Customer class display");
    }
}