package dataAccess.concretes;

import dataAccess.abstracts.PlayerDao;
import entities.concrete.Player;

public class PlayerDaoManager implements PlayerDao {
    @Override
    public void add(Player player) {
        System.out.println("Kullanıcı eklendi : " + player.getFirstName() +" " +player.getLastName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Kullanıcı güncellendi :" + player.getFirstName() +" " + player.getLastName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Kullanıcı silindi :" + player.getFirstName() +" " + player.getLastName());
    }
}
