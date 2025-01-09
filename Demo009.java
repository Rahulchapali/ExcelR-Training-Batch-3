import java.util.*;
public class Demo009 {
    
        String Cust_name = "rishi";
        Long Account_no = 1234567890;
        Double Balance = 100.00;
        void accept_details(){
            Scanner sc = new Scanner(System.in);
            Cust_name = sc.nextLine();
            Account_no =sc.nextLong();
        }
        void Display_details(){
        System.out.println("Hello "+Cust_name);
        System.out.println("Ur Balance is "+Balance);
    
        }
        
        public static void main(String[] args){
            Demo009 obj ;
            obj.accept_details();
            obj.Display_details();
        }
    }


        
