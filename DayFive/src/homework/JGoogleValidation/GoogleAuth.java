package homework.JGoogleValidation;

import homework.entities.concretes.User;

public class GoogleAuth {
    public void auth(User user) {
        System.out.println(user.getFirstName() + " adlı kullanıcı Google Auth ile doğrulandı!");
    }
}
