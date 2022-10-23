
public class User {

    private static int length;
    String name;
    int age;
    int size;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        int sum = 0;
        this.size = 0;
    }

    public static void main(String[] args) {
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);
        User[] users = {anna, betty, carl, david, eva, frankie};


        double sumAge;
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;

            double averageAge = sum / users.length;
            if (users[i].age < averageAge) {
                System.out.println(users[i].name + users[i].age + " wiek osoby poniżej średniej");
            }
        }
    }
}



















































































