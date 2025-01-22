public class PS001 {
    private int id;
    private String firstName, lastName, address;
    public PS001() {
        this(0, "Mahesh", "Babu", "Hyderabad");
    }
    public PS001(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public static void main(String[] args) {
        PS001 emp1 = new PS001();
        System.out.println("Default Constructor:\nFull Name: " + emp1.getFullName() + "\nAddress: " + emp1.address);

        PS001 emp2 = new PS001(1, "Mahesh", "Babu", "Hyderabad");
        System.out.println("\nParameterized Constructor:\nFull Name: " + emp2.getFullName() + "\nAddress: " + emp2.address);
    }
}
