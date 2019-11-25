public class User {
    String name;
    int age;

    public static void main(String[] args) {
        User[] user = new User[8];
        String[] names = { "Adan","Jan","Rudolf","Nina","Zosia","Wiola","Anna","Maria" };
        int[] ages = {23,27,54,38,18,27,33,31};

        int sumAge=0;
        double averageAge=0;
        for  (int i = 0; i < ages.length; i++) {
            sumAge=sumAge+ages[i];
        }
        averageAge=sumAge/ages.length;

        for(int i=0; i< user.length; i++){
            user[i] = new User();
            user[i].name = names[i];
            user[i].age = ages[i];
        }
        System.out.println("average age = " +averageAge);
        System.out.println("Users in age below average are:");
        for(int i=0; i<user.length; i++){
            if(user[i].age < averageAge)
            System.out.println(user[i].name+" "+user[i].age);
        }

    }
}
