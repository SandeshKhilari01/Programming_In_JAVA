class Bank {
    public static void main(String[] args){
        String username = "Tendulkar";
        int size = username.length();
        if(size>8 && size<15) {
            char arr[] = username.toCharArray();
            int count = 0;
            for(char c: arr){
                if(c>='a' && c<='z') {
                    count++;
                }
            }
            if(count==size) {
                System.out.println("Username is valid");
            } 
            else {
                System.out.println("Username is not valid");
            }

            String firstName = "Sachin";
            String lastName = "Tendulkar";
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);

            StringBuilder sb = new StringBuilder(firstName);
            String fName = sb.append(lastName).toString();
            System.out.println(fName);

            int number = 45678;
            int temp = number;
            int reverse = 0;
            while(temp!=0) {
                int rem = temp%10;
                reverse = reverse*10 + rem;
                temp = temp/10;
            }
            System.out.println(reverse);
        }
    }
}