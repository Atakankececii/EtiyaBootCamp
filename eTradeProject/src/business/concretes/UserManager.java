package business.concretes;

import business.abstracts.UserService;
import core.GoogleAccountService;
import core.VerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private UserDao userDao;
    private GoogleAccountService googleAccountService;
    private VerificationService verificationService;

    public UserManager(UserDao userDao,GoogleAccountService googleAccountService,VerificationService verificationService){
        this.userDao = userDao;
        this.googleAccountService = googleAccountService;
        this.verificationService = verificationService;
    }

    @Override
    public void add(User user) {
        try {
            checkIfUserFirstNameShort(user);
            checkIfEmailExists(user);
            checkPassword(user);
            checkIfUserLastNameShort(user);
            checkUserEmailFormat(user);
            userDao.add(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void login(User user) throws Exception {
        checkIfEmailPassword(user);
        System.out.println("Giriş yapıldı : "+ user.getFirstName());

    }

    @Override
    public void register(User user) {
        googleAccountSignIn(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return this.userDao.getAll();
    }

    private void checkUserEmailFormat(User user) throws Exception {
        String REGEX = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(user.getEmail());

        if (!matcher.matches()){
            throw new Exception();
        }

    }

    private void checkPassword(User user) throws Exception {
        if (user.getPassword().length()<6){
            throw new Exception();
        }

    }

    private void checkIfEmailExists(User user) throws Exception{

        for(User data : this.userDao.getAll()){
            if (user.getEmail() == data.getEmail()){
                throw new Exception();
            }
        }
    }
    private void checkIfUserFirstNameShort(User user) throws Exception {
        if (user.getFirstName().length() < 2) {
            throw new Exception();
        }
    }

    private void checkIfUserLastNameShort(User user) throws Exception {
        if (user.getLastName().length() < 2) {
            throw new Exception();
        }
    }
    private void googleAccountSignIn(User user){
        if(googleAccountService.googleLogin(user.getEmail())){
            System.out.println("Google hesabı üzerinden giriş yapılıyor.");
        }
    }
    private void checkIfEmailPassword(User user) throws Exception{
        User userFromRepository = getById(user.getId());
        if(!(userFromRepository.getEmail() == user.getEmail() && userFromRepository.getPassword() == user.getPassword())) {
            throw new Exception("hata");
        }
    }

    private void checkVerificationEmailSended(User user) throws Exception {
        if (!this.verificationService.verification(user.getEmail())) {

            throw new Exception();
        }
    }

}
