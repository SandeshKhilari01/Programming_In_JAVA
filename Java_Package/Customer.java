package sales;
import finance.Bank;
public class Customer{
    public static void main(String[] args){
        Bank bank = new Bank("Ibank", "Delhi", "0000000", 2000);
        bank.displayDetails();
        System.out.println(bank.noofEmployees);
    }
}