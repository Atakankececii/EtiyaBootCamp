package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.concrete.Game;
import entities.concrete.Player;

public class GameDaoManager implements GameDao {
    @Override
    public void buy(Player player, Game game) {
        System.out.println("Oyun satın alındı :"+ player.getFirstName() +"\n"+"Oyunun adı : "+ game.getGameName());
    }

    @Override
    public void rent(Player player, Game game) {
        System.out.println("Oyun kiralandı :"+ player.getFirstName() +"\n"+"Oyunun adı : "+ game.getGameName());
    }

    @Override
    public void sell(Player player, Game game) {
        System.out.println("Oyun satıldı :"+ player.getFirstName() +"\n"+"Oyunun adı : "+ game.getGameName());
    }
}
