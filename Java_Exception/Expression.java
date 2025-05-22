class Expression{
    public static void divide(int m, int n){
        assert n!=0 : "The 'n' value should not be null";
    }
    public static void main (String[] args){
        divide(10,0);
    }
}
