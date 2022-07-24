package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<>();
    @Override
    public void add(User user) {
        System.out.println("Kullanıcı eklendi :" + user.getFirstName());
        users.add(user);
    }


    @Override
    public User getById(int id) {
        User findToUser = null;
        for (User user : users){
            if (user.getId() == id){
                findToUser = user;
            }
        }
        return findToUser;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
