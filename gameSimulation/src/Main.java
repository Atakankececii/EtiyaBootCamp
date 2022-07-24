import adapters.mernisreference.JOLKPSPublicSoap;
import business.abstracts.CampaignService;
import business.abstracts.GameService;
import business.abstracts.PlayerService;
import business.concretes.*;
import dataAccess.concretes.CampaignDaoManager;
import dataAccess.concretes.GameDaoManager;
import dataAccess.concretes.PlayerDaoManager;
import entities.concrete.Campaign;
import entities.concrete.Game;
import entities.concrete.Player;

public class Main {

    public static void main(String[] args) throws Exception {

        JOLKPSPublicSoap client = new JOLKPSPublicSoap();

        Player player1 = new Player();
        player1.setFirstName("Süleyman Atakan");
        player1.setLastName("Keçeci");
        player1.setId(1);
        player1.setNationalityId("123456789");
        player1.setBirthYear(1999);

        Game game1 = new Game();
        game1.setGameName("Call of Duty");
        game1.setGameType("FPS");
        game1.setId(1);
        game1.setUnitPrice(500);

        Campaign campaign1 = new Campaign();
        campaign1.setId(1);
        campaign1.setDiscountRate(0.2);
        campaign1.setName("Black Friday");
        //PlayerService playerService = new PlayerManager(new PlayerDaoManager(), new MernisCheckManager());
        //playerService.add(player1);

        //GameService gameService = new GameManager(new GameDaoManager(), new MernisCheckManager());
        //gameService.buy(player1,game1);
        CampaignManager campaignManager = new CampaignManager(new CampaignDaoManager());
        campaignManager.add(campaign1,game1);
        double sonuc = campaignManager.hesapla(campaign1,game1);
        System.out.println("Kampanya uygulandı. Yeni fiyat : "+sonuc);

    }

}
