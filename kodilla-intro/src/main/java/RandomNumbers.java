import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
    }

    public int getCountOfRandomNumber(int max, int range ) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(range);
            sum = sum + temp;
            result++;
        }
        return result;
    }

    public int getSmallestValue(int max, int range) {
        Random random = new Random();
        int sum = 0;
        int smallestValue = range-1;
        while (sum < max) {
            int temp = random.nextInt(range);
            sum = sum + temp;
            if (temp < smallestValue) {
                smallestValue = temp;
            }
        }
        return smallestValue;
    }
    public int getLargestValue(int max, int range) {
        Random random = new Random();
        int sum = 0;
        int largestValue = 0;
        while (sum < max) {
            int temp = random.nextInt(range);
            sum = sum + temp;
            if (temp > largestValue) {
                largestValue = temp;
            }
            System.out.println( "wartość największa = " + largestValue );
        }
        return largestValue;
    }
    public void getResults() {


        int result = getCountOfRandomNumber(5000,31);

        int smallestValue = getSmallestValue (5000, 31);

        int largestValue = getLargestValue(5000,31);

        System.out.println("liczba losowań = " + result + "wartość najmniejsza = " + smallestValue + "wartość największa = " );

    }

}
