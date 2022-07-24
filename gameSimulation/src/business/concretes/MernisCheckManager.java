package business.concretes;

import adapters.mernisreference.JOLKPSPublicSoap;
import business.abstracts.PersonCheckService;
import entities.concrete.Player;

import java.rmi.RemoteException;
import java.util.Locale;

public class MernisCheckManager implements PersonCheckService {

    boolean result = true;
    @Override
    public boolean checkIfRealPerson(Player player) {
        try{
            JOLKPSPublicSoap client = new JOLKPSPublicSoap();
            result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),player.getFirstName().toUpperCase(new Locale("tr")),player.getLastName().toUpperCase(new Locale("tr")),player.getBirthYear());

        }catch (RemoteException exception){
            exception.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
