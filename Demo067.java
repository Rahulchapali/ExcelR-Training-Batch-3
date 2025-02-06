

public class Demo067 {
 
    public static void main(String[] args) {
        int [] arr ={12,20,30,45,11};
        int n = arr.length;
        int count = 0;
        System.out.println("Even numbers are: ");
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 ==0){
                System.out.println("Even number "+(i+1)+" : "+arr[i]);
            }
           
        }
        
    }
}