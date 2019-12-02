public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getUserName() {
        return name;
    }

    int getUserAge() {
        return age;
    }

    public static void main(String[] args) {

        User jan = new User("Jan", 54);
        User rudolf = new User("Rudolf", 54);
        User nina = new User("Nina", 38);
        User zosia = new User("Zosia", 18);
        User wiola = new User("Wiola", 27);
        User anna = new User("Anna", 33);
        User maria = new User("Maria", 31);
        User adam = new User("Adam", 23);

        User[] users = {jan, rudolf, nina, zosia, wiola, anna, maria, adam};

        int sumAge = 0;
        for (int i = 0; i < users.length; i++) {
            sumAge = sumAge + users[i].getUserAge();
        }
        int averageAge;
        averageAge = sumAge / users.length;

        System.out.println("average age = " + averageAge);

        System.out.println("Users in age below average are:");


        for (int i = 0; i < users.length; i++) {

            if (users[i].getUserAge() < averageAge) {
                System.out.println( users[i].getUserName() + "  " + users[i].getUserAge());
            }
        }

    }
}
