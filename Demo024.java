import java.util.ArrayList;
class FriendList {
    ArrayList<String[]> list = new ArrayList<>();
    public FriendList() {
        list.add(new String[] {"Mahesh", "7842517366", "Hyderabad"});
        list.add(new String[] {"Deepak", "56464565410", "Hyderabad"});
        list.add(new String[] {"Reavanth", "6454546565", "Hyderabad"});
        list.add(new String[] {"Bhanu", "9012345678", "Hyderabad"});
        list.add(new String[] {"Bharath", "1112223333", "India"});
    }
    public void displayFriends() {
        for (String[] friend : list) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println();
        }
    }
}
public class Demo024 {
    public static void main(String[] args) {
        FriendList friendList = new FriendList();
        friendList.displayFriends();
    }
}


