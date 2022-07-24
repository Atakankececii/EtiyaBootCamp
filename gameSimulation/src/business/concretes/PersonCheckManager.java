package business.concretes;

import business.abstracts.PersonCheckService;
import entities.concrete.Player;

public class PersonCheckManager implements PersonCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        return true;
    }
}
