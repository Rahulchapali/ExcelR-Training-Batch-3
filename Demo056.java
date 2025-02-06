

public class Demo056 {
    public static void main(String[] args) {
        int number = 123;
        SumCube obj = new SumCube();
        int sumOfCubes = obj.calculateSumOfCubes(number);
        System.out.println("Sum of cubes of digits: " + sumOfCubes);
    }
}
class SumCube{
    public int calculateSumOfCubes(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }
}