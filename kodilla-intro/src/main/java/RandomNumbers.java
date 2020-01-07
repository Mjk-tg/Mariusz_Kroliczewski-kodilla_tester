import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        System.out.println("wartość najmniejsza = " + getSmallestValue (5000, 30));
        System.out.println( "wartość największa = " + getLargestValue(5000,30));

    }

    public static int getCountOfRandomNumber(int max, int range ) {
        Random random = new Random();

        int sum = 0;
        int result =0;
        while (sum < max) {
            int temp = random.nextInt(range+1);
            sum = sum + temp;
            result = temp;
        }
        return result;
    }

    public static int getSmallestValue(int max, int range) {
        int result;
        int smallestValue = range;
        result=getCountOfRandomNumber(max,range);
            if (result < smallestValue) {
                smallestValue = result;
            }
            return smallestValue;
    }
    public static int getLargestValue(int max, int range) {
        int result;
        int largestValue = 0;
        result=getCountOfRandomNumber(max,range);
            if (result > largestValue) {
                largestValue = result;
            }
            return largestValue;
    }

}
