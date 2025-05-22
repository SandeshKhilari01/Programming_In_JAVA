public class Test {
    String rating(int initial, int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int rating = sum + initial;
        if (rating > 1000) return "Pro";
        else return "Noob";
    }

    public static void main(String args[]) {
        Test test = new Test(); // Create an instance of Test
        int initial = 1500;
        int arr[] = {400, -500, 1000, 300};
        System.out.println(test.rating(initial, arr)); // Call the rating method on the instance
    }
}
