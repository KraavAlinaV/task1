import java.util.Comparator;
import java.util.Objects;

public class User {
    public static final Comparator<User> COMPARE_BY_AGE = new Comparator<User>() {
        @Override
        public int compare(User lhs, User rhs) {
            return lhs.age - rhs.age;
        }
    };
    private String firstName;
    private String secondName;
    private Integer age;

    public User(){
        setFirstName(null);
        setSecondName(null);
        setAge(null);
    }

    public User(String firstName, String secondName, Integer age) {
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
    }

    public String getSecondName(){
        return this.secondName;
    }

    private void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge(){
        return this.age;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getSecondName(), user.getSecondName()) &&
                Objects.equals(getAge(), user.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName(), getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
