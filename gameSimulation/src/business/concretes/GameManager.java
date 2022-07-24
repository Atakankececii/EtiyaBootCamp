package business.concretes;

import business.abstracts.GameService;
import business.abstracts.PersonCheckService;
import dataAccess.abstracts.GameDao;
import entities.concrete.Game;
import entities.concrete.Player;

public class GameManager implements GameService {
    GameDao gameDao;
    PersonCheckService personCheckService;

    public GameManager( GameDao gameDao, PersonCheckService personCheckService ){
        this.gameDao = gameDao;
        this.personCheckService = personCheckService;
    }

    @Override
    public void buy(Player player, Game game) {
        if (personCheckService.checkIfRealPerson(player)){
            gameDao.buy(player,game);
        }else{
            System.out.println("Kullanıcı bilgileri geçersizdir.");
        }
    }

    @Override
    public void rent(Player player, Game game) {
        if (personCheckService.checkIfRealPerson(player)){
            gameDao.rent(player,game);
        }else{
            System.out.println("Kullanıcı bilgileri geçersizdir.");
        }
    }

    @Override
    public void sell(Player player, Game game) {
        if (personCheckService.checkIfRealPerson(player)){
            gameDao.sell(player,game);
        }else{
            System.out.println("Kullanıcı bilgileri geçersizdir.");
        }
    }
}
