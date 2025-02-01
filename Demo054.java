package Core_Java;

class MethOver {
    // Method with 2 int parameters
    void display(int a, int b) {
        System.out.println("Method with 2 int parameters: " + a + ", " + b);
    }

    // Method with 2 double parameters
    void display(double a, double b) {
        System.out.println("Method with 2 double parameters: " + a + ", " + b);
    }

    // Method with 1 int and 1 double parameter
    void display(int a, double b) {
        System.out.println("Method with 1 int and 1 double parameter: " + a + ", " + b);
    }

    // Method with 1 double and 1 int parameter
    void display(double a, int b) {
        System.out.println("Method with 1 double and 1 int parameter: " + a + ", " + b);
    }
}
public class Demo054 {
    public static void main(String[] args) {
        MethOver obj = new MethOver();
        obj.display(10, 20);
        obj.display(10.5, 20.5);
        obj.display(10, 20.5);
        obj.display(10.5, 20);
    }
}