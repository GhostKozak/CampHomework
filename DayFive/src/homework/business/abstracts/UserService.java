package homework.business.abstracts;

import homework.dataAccess.abstracts.UserDao;
import homework.entities.concretes.User;

public interface UserService {
    void login(User user, UserDao userDao);
    void register(User user);
}
