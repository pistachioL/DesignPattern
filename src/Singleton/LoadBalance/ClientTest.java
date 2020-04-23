package Singleton.LoadBalance;

public class ClientTest {
    public static void main(String[] args){
        LoadBalance load1,load2;
        load1 = LoadBalance.getLobalance();
        load2 = LoadBalance.getLobalance();
        System.out.println("负载均衡器唯一吗?");
        System.out.println(load1 == load2);
    }
}
