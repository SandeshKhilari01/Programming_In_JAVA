
class Bank{
    public static void main(String[] args){
        Customer[] customer = new Customer[2]; // reference type array
        Customer customer1 = new Customer("Anil", "Ac100");
        Customer customer2 = new Customer("Ajay", "Ac101");
        customer[0] = customer1;
        customer[1] = customer2;
        for(int i = 0; i<customer.length;i++){
            Customer customeObject = customer[i];
            String name = customeObject.displayCustomerName();
            System.out.println("The customer name is... "+name);
        }
        double salary[] = {23500.0,25080.0,28760.0,22340.0,19890.0};
        double totalSalary = 0;
        for(int i = 0;i<salary.length;i++){
            totalSalary+=salary[i];
        }
        double avgSalary = totalSalary / salary.length;
        int greatAvgSalary = 0;
        int lesserAvgSalary = 0;
        for(int i = 0;i<salary.length;i++){
             if(avgSalary <salary[i]){
                greatAvgSalary++;
             }
             else{
                lesserAvgSalary++;
             }
        }
        System.out.println("Average salary of an Employees are: "+avgSalary);
        System.out.println("Number of employees greater than average salary is :"+greatAvgSalary);
        System.out.println("Number of employees lesser than average salary is :"+lesserAvgSalary);
    }
}
class Customer{
    private String name;
    private String customerId;

    Customer(String uname, String UcustomerId){
        name = uname;
        customerId = UcustomerId;
    }
    public String displayCustomerName(){
        return name;
    }
}
