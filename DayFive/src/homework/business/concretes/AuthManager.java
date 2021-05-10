package homework.business.concretes;

import homework.business.abstracts.AuthService;
import homework.entities.concretes.User;

public class AuthManager implements AuthService {

    @Override
    public void auth(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı sistem tarafından onaylandı");
    }
}
