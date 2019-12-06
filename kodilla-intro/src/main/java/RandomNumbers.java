import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int smallestValue = getSmallestValue (5000, 30);
        System.out.println("wartość najmniejsza = " + smallestValue);

        int largestValue = getLargestValue(5000,30);
        System.out.println( "wartość największa = " + largestValue);

    }

    public static int getSmallestValue(int max, int range) {
        Random random = new Random();
        int sum = 0;
        int smallestValue = range;
        while (sum < max) {
            int temp = random.nextInt(range+1);
            sum = sum + temp;
            if (temp < smallestValue) {
                smallestValue = temp;
            }
        }
        return smallestValue;
    }
    public static int getLargestValue(int max, int range) {
        Random random = new Random();
        int sum = 0;
        int largestValue = 0;
        while (sum < max) {
            int temp = random.nextInt(range+1);
            sum = sum + temp;
            if (temp > largestValue) {
                largestValue = temp;
            }
        }
        return largestValue;
    }

}
