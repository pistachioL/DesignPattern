package Singleton.Multiple;

import java.util.ArrayList;
import java.util.Random;

public class Multiton {
    private static ArrayList<Multiton>instances =  new ArrayList<>();
    private static Multiton multiton;
    private String name;

    public String getName() {
        return name;
    }

    private Multiton(String name){
        this.name = name;
    };

    public static Multiton randomMulti(int cnt){
        if(instances.size() == 0) {
            System.out.println("创建实例");
            multiton = new Multiton("name");
            for (int i = 0; i < cnt; i++) {
                instances.add(new Multiton("实例" + i));
            }
        }
        else{
            System.out.println("不能再创建再多的实例");
            return multiton;
        }
        return multiton;
    }

    public Multiton getInstance(){
        return instances.get(new Random().nextInt(instances.size()));
    }


}
