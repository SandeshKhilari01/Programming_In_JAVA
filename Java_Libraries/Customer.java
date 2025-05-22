class Customer {
    private int custId;
    private String custName;

    public Customer(int custId, String custName){
        this.custId = custId;
        this.custName = custName;
    }
    public int hashCode() {
        return custId;
    }
    public boolean equals(Object ob){
    }
}