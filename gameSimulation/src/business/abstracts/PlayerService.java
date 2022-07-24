package business.abstracts;

import entities.concrete.Player;

public interface PlayerService {
    void add(Player player);
    void update(Player player);
    void delete(Player player);
}
