package business.abstracts;

import entities.concrete.Game;
import entities.concrete.Player;

public interface GameService {
    void buy(Player player, Game game);
    void rent(Player player, Game game);
    void sell(Player player, Game game);
}
