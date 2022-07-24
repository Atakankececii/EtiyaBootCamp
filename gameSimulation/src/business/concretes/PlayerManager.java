package business.concretes;

import business.abstracts.PersonCheckService;
import business.abstracts.PlayerService;
import dataAccess.abstracts.PlayerDao;
import entities.concrete.Player;

public class PlayerManager implements PlayerService {

    PlayerDao playerDao;
    PersonCheckService personCheckService;

    public PlayerManager(PlayerDao playerDao, PersonCheckService personCheckService){
        this.personCheckService = personCheckService;
        this.playerDao = playerDao;
    }


    @Override
    public void add(Player player) {
        if (personCheckService.checkIfRealPerson(player)){
            playerDao.add(player);
        }else{
            System.out.println("Kullanıcı bilgileri hatalı :" + player.getFirstName());
        }
    }

    @Override
    public void update(Player player) {
        if (personCheckService.checkIfRealPerson(player)){
            playerDao.update(player);
        }else{
            System.out.println("Kullanıcı bilgileri hatalı :" + player.getFirstName());
        }
    }

    @Override
    public void delete(Player player) {
        if (personCheckService.checkIfRealPerson(player)){
            playerDao.delete(player);
        }else{
            System.out.println("Kullanıcı bilgileri hatalı :" + player.getFirstName());
        }
    }
}
