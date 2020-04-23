package Singleton.Multiple;

public class ClientTest {
    public static void main(String[] args){
        Multiton multiton = Multiton.randomMulti(10);
      //  Multiton multiton1 = Multiton.getInstance(5);
        for(int i = 0 ; i < 10; i ++){
            System.out.println(multiton.getInstance().getName());
        }
    }
}
