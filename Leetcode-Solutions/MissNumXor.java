
class MissNumXor {
    public int missingNumber(int[] nums) {
        int n = nums.length+1;
        int xor1 = 0;
        int xor2 = 0;
        for( int i = 0; i<n; i++){
            xor1 = xor1 ^ i;
        }
        for( int i = 0; i<n-1; i++){
            xor2 = xor2 ^ nums[i];
        }
        return xor1 ^ xor2;
    }
    
    public static void main(String[] args) {
        MissNumXor missNumXor = new MissNumXor();
        int[] nums = {0, 1, 3}; // array with missing number 2
        int result = missNumXor.missingNumber(nums);
        System.out.println("The missing number is: " + result);
    }
}
