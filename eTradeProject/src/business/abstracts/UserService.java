package business.abstracts;

import entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void login(User user) throws Exception;
    void register(User user);
    User getById(int id);
    List<User> getAll();
}
