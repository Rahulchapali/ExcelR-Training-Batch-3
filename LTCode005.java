import java.util.Scanner;


public class LTcode005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        int[] result = sol.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        sc.close();
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index[] = new int[2];
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target&&i!=j){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}
