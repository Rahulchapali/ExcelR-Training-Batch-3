import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLowerCase(ch)) {
            char upperChar = Character.toUpperCase(ch);
            System.out.println("Uppercase: " + upperChar);
        } else {
            System.out.println("The input is not a lowercase letter.");
        }
        
        scanner.close();
    }
}