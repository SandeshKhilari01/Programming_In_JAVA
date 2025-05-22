package finance;

/**
 * Represents a bank with a name, area, phone number, and number of employees.
 */
public class Bank {
    private String bankName;
    private String area;
    private String phoneNumber;
    private int numberOfEmployees;

    /**
     * Constructs a new Bank object.
     * 
     * @param bankName        the name of the bank
     * @param area            the area where the bank is located
     * @param phoneNumber     the phone number of the bank
     * @param numberOfEmployees the number of employees at the bank
     */
    public Bank(String bankName, String area, String phoneNumber, int numberOfEmployees) {
        this.bankName = bankName;
        this.area = area;
        this.phoneNumber = phoneNumber;
        this.numberOfEmployees = numberOfEmployees;
    }

    /**
     * Gets the name of the bank.
     * 
     * @return the name of the bank
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Gets the area where the bank is located.
     * 
     * @return the area where the bank is located
     */
    public String getArea() {
        return area;
    }

    /**
     * Gets the phone number of the bank.
     * 
     * @return the phone number of the bank
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the number of employees at the bank.
     * 
     * @return the number of employees at the bank
     */
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Bank [bankName=" + bankName + ", area=" + area + ", phoneNumber=" + phoneNumber + ", numberOfEmployees="
                + numberOfEmployees + "]";
    }
}