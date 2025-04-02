import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<User> users = new ArrayList<>();

    public void add(User u) {
        users.add(u);
    }
    public void age(User u1) {
        users.add(u1);
    }

    public void greet() {
        users.forEach(User::greet);
    }
}
