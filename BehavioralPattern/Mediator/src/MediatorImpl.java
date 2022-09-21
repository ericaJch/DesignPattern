import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
    List<User> user;

    public MediatorImpl() {
        user = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.user.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.user) {
            if (u != user) {
                u.recieve(message);
            }
        }

    }
}
