public class UserManager {
    public void add(User user) {
        System.out.println(user.getUserName() + " takma adlı " + user.getUserType() + " sisteme kaydedildi");
    }

    public void remove(User user) {
        System.out.println(user.getUserName() + " takma adlı " + user.getUserType() + " sistemden silindi");
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            add(user);
        }
    }

    public void removeMultiple(User[] users) {
        for (User user : users) {
            remove(user);
        }
    }
}
