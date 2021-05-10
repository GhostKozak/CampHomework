package homework.dataAccess.concretes;

import homework.dataAccess.abstracts.UserDao;
import homework.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı eklendi");
    }

    @Override
    public void remove(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı silindi");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı bilgileri güncellendi");
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean loginCheck(String email, String password) {
        return true;
    }
}
