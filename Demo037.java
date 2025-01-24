import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        int biggest;
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            biggest = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            biggest = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            biggest = num3;
        } else {
            biggest = num4;
        }

        System.out.println("The biggest number is: " + biggest);

        scanner.close();
    }
}
