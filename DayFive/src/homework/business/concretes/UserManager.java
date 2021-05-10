package homework.business.concretes;

import homework.business.abstracts.UserService;
import homework.dataAccess.abstracts.UserDao;
import homework.entities.concretes.User;

public class UserManager implements UserService {
    UserDao userDao;

    @Override
    public void login(User user, UserDao userDao) {
        if(userDao.loginCheck(user.getEmail() , user.getPassword())) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Giriş yapılamadı, bilgileriniz kontrol edin.");
        }
    }

    @Override
    public void register(User user) {
        String REGEX_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        boolean email_check_result = user.getEmail().matches(REGEX_PATTERN);
        if (user.getPassword().length() > 6 && email_check_result && user.getFirstName().length() > 2 && user.getLastName().length() > 2 ) {
            System.out.println("Kaydınız alınmıştır.");
            System.out.println(user.getEmail() + " adlı mail adresinize onay mailı gönderilmiştir.");
        } else {
            System.out.println("Kullanıcı bilgileri kayıt olma kurallarını uymuyor. Kurallara uyduğunuza emin olunuz.");
            System.out.println("-------------------------");
            System.out.println("--------Kurallar---------");
            System.out.println("İsim ve soyisim en az 2 karakterden oluşmalıdır.");
            System.out.println("Parola en az 6 karakterden oluşmalıdır");
            System.out.println("Epostanızı doğru girdiğinize emin olunuz");
        }
    }

}
