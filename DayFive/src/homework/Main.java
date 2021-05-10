package homework;

import homework.business.abstracts.AuthService;
import homework.business.abstracts.UserService;
import homework.business.concretes.UserManager;
import homework.adapters.JGoogleAuthAdapter;
import homework.dataAccess.concretes.HibernateUserDao;
import homework.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setFirstName("Gökhan");
        user.setLastName("Tanrıverdi");
        user.setEmail("codeodd3@gmail.com");
        user.setPassword("verystrongandsecretpassword");

        AuthService authS = new JGoogleAuthAdapter();
        authS.auth(user);

        UserService userService = new UserManager();
        userService.register(user);

        userService.login(user, new HibernateUserDao());
    }
}
