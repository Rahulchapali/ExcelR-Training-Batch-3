class LTcode006 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        LTcode006 solution = new LTcode006();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};       
        System.out.println("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }        
        int length = solution.removeDuplicates(nums);
        System.out.println("\nArray after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLength of array after removing duplicates: " + length);
    }
}