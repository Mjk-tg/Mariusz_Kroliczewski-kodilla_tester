public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[8];
        animals[0] = "Dog";
        animals[1] = "Cat";
        animals[2] = "Rabbit";
        animals[3] = "Elephant";
        animals[4] = "Raccoon";
        animals[5] = "Bear";
        animals[6] = "Bat";
        animals[7] = "Golden Fish";

        String animal = animals[3];
        int nunberOfElements = animals.length;
        System.out.println( animal);
        System.out.println( "Moja tablica zawiera " + nunberOfElements +" elementów.");

    }
}
