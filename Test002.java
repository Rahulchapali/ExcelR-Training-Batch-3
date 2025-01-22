import java.util.*;

class Test002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter reply: ");
        String reply = sc.next();
        while(reply.equals("yes")||reply.equals("Yes")||reply.equals("YES")){
            System.out.println("Happy sankranthi.");
            System.out.print("Enter reply: ");
            reply = sc.next();
        }
    }
}