import java.util.*;
 class Demo010 {
    
        String Cust_name = "rishi";
        int Account_no = 1234567890;
        Double Balance = 100.00;
        void accept_details(){

            Scanner sc = new Scanner(System.in);
            Cust_name = sc.nextLine();
            Account_no =sc.nextInt();
        }
        void Display_details(){
        System.out.println("Hello "+Cust_name);
        System.out.println("Ur Balance is "+Balance);
        }
        }
    public class Demo010 {
        public static void main(String[] args){
            Demo010 obj = new Demo010();
            obj.accept_details();
            obj.Display_details();

        }
    }



        

