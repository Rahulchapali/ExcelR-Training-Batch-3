

public class Demo055 {
    public static void main(String[] args) {
        int number = 1234;
        SumSquare obj = new SumSquare();
        int sumOfCubes = obj.calculateSumOfSquares(number);
        System.out.println("Sum of cubes of digits: " + sumOfCubes);
    }
}
class SumSquare{
    public int calculateSumOfSquares(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}