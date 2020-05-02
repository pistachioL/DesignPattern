package observerPattern;

public class ClientTest {
    public static void main(String[] args) {
        AbsAlliance alliance = new ConcreteAlliance("哈利波特联盟");

        Observer player1,player2,player3,player4,player5;

        player1 = new Player("Harry");
        alliance.join(player1);

        player2 = new Player("格兰杰");
        alliance.join(player2);

        player3 = new Player("卫斯理");
        alliance.join(player3);

        player4 = new Player("隆巴顿");
        alliance.join(player4);

        player5 = new Player("珍妮");
        alliance.join(player5);

        player5.beAttacked(alliance);
        System.out.println("---------------------------");
        System.out.println();
        player4.beAttacked(alliance);
    }
}
