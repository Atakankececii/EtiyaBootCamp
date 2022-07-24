package entities.concrete;

public class Game {
    private int id;
    private String gameName;
    private String gameType;
    private double unitPrice;

    public Game() {
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Game(int id, String gameName, String gameType, double unitPrice) {
        this.id = id;
        this.gameName = gameName;
        this.gameType = gameType;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
