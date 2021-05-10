package homework.dataAccess.abstracts;

import homework.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void remove(User user);
    void update(User user);
    List<User> getAll();
    boolean loginCheck(String email,String password);
}
