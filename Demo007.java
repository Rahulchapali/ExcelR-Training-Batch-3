import java.util.Scanner;
public class Demo007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        Long phoneno;
        System.out.println("please enter your name");
        name = scanner.nextLine();
        System.out.println("please enter your age");
        age = scanner.nextInt();
        System.out.println("please enter your phoneno");
        phoneno = scanner.nextLong();
        System.out.println("hello "+name +"ur age is"+ age+"ur phone no is"+phoneno);
        scanner.close();
        }
}