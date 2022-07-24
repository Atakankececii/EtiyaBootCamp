import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleServiceAdapter;
import core.VerificationServiceAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;
import googleAccount.GoogleAccountManager;

public class Main {
    public static void main(String[] args){

        User user = new User();
        user.setEmail("atakankececi@hotmail.com");
        user.setFirstName("Atakan");
        user.setId(1);
        user.setLastName("Keçeci");
        user.setPassword("123456");

        UserService userService = new UserManager(new HibernateUserDao(), new GoogleServiceAdapter(),new VerificationServiceAdapter());
        userService.add(user);
    }
}
