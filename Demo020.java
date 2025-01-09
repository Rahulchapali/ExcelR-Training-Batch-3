class FizzBizz{
    public String getFizzBizz(int number) {
        if (number <= 0) {
            return "Error";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ";
        }

        else if (number % 3 == 0) {
            return "FIZZ";
        }

        else if (number % 5 == 0) {
            return "BIZZ";
        }
        else {
            return String.valueOf(number);
        }
    }
}

public class Demo020{
    public static void main(String[] args) {
        FizzBizz calculator = new FizzBizz();

        System.out.println(calculator.getFizzBizz(15));
        System.out.println(calculator.getFizzBizz(9));  
        System.out.println(calculator.getFizzBizz(10));
        System.out.println(calculator.getFizzBizz(7));
        System.out.println(calculator.getFizzBizz(-5)); 
        System.out.println(calculator.getFizzBizz(0)); 
    }
}