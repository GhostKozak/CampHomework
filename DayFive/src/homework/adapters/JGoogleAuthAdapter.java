package homework.adapters;

import homework.JGoogleValidation.GoogleAuth;
import homework.business.abstracts.AuthService;
import homework.entities.concretes.User;

public class JGoogleAuthAdapter implements AuthService {

    @Override
    public void auth(User user) {
        GoogleAuth googleAuth = new GoogleAuth();
        googleAuth.auth(user);
    }
}
