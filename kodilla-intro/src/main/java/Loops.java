public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd" , "Gwidon" , "Florentyna"};
        int nunberOfElements = names.length;
        for (int i = 0; i <nunberOfElements; i++) {
            System.out.println(i +". "+ names[i]);
        }
        for (int i = names.length -1; i>=0; i--) {
            System.out.println(names[i]);
        }
        String[] names1 = new String[] {"Tola" , "Bolek" , "Lolek"};
        for (int i = 0; i <names1.length; i++) {
            System.out.println(names1[i]);
        }
    }

    public int tableNumbersSum(int[] table) {
        int sum = 0;
        for (int i = 0; i == table.length-1; i++) {
            sum = sum+table[i];
        }
     return sum;

    }

}
