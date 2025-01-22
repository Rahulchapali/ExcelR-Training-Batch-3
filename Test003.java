import java.util.Scanner;
class Item {
    String item;
    int price;
    void calculatePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item name: ");
        item = sc.next();
        System.out.print("Enter the Quantity: ");
        int quantity = sc.nextInt();
        if (item.equals("Apple")) {
            price = 100 * quantity;
        } else if (item.equals("Banana")) {
            price = 200 * quantity;
        } else {
            System.out.println("Invalid Item");
        }
    }
    void displayPrice() {
        System.out.println("Total Price: " + price);
    }
public class Test003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        sc.nextLine();
        Item item = new Item();
        for (int i = 0; i < n; i++) {
            item.calculatePrice();
            item.displayPrice();
        }
    }
}
}
