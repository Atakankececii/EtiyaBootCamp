package business.abstracts;

import entities.concrete.Player;

public interface PersonCheckService {
    boolean checkIfRealPerson(Player player);
}
