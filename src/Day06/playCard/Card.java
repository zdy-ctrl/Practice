package Day06.playCard;

public class Card {
    private String hua;
    private String dian;

    public Card() {
    }

    public Card(String hua, String dian) {
        this.hua = hua;
        this.dian = dian;
    }

    public String getHua() {
        return hua;
    }

    public void setHua(String hua) {
        this.hua = hua;
    }

    public String getDian() {
        return dian;
    }

    public void setDian(String dian) {
        this.dian = dian;
    }

    public void showCard() {
        System.out.println("这张牌的花色是" + hua + ",这张牌的点数是" + dian);
    }
}
