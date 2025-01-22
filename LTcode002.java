import java.util.Scanner;

class Solution {
    public int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
public class LTCode002 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();;
        Solution sol = new Solution();
        int result = sol.reverse(number);
        System.out.println(result);
    }
}