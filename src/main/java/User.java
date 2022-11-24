import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPost;
    private String group;

    private String country;

    public User(String username, int age, int numberOfPost, String group, String country) {
        this.username = username;
        this.age = age;
        this.numberOfPost = numberOfPost;
        this.group = group;
        this.country = country;
    }

    public String getCountry(){
        return country;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getAge() == user.getAge() && getNumberOfPost() == user.getNumberOfPost() && getUsername().equals(user.getUsername()) && getGroup().equals(user.getGroup()) && getCountry().equals(user.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getAge(), getNumberOfPost(), getGroup(), getCountry());
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", numberOfPost=" + numberOfPost +
                ", group='" + group + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
