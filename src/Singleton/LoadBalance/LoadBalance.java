package Singleton.LoadBalance;

import java.util.ArrayList;
import java.util.Random;

public class LoadBalance {
    private  static LoadBalance instance= null;  //私有　静态
    private ArrayList<String> serviceList = null;
    String s;
    private LoadBalance(){   //私有构造函数
        serviceList = new ArrayList<>(); {
        }
    };
    synchronized public static LoadBalance getLobalance(){
        if(instance == null){
            System.out.println("创建负载均衡");
            instance = new LoadBalance();
        }
        else{
            System.out.println("负载均衡器在使用中。。");
        }
        return instance;
    }

    public void addServer(String server){
        System.out.println("添加请求");
    }
    public void removeServer(String server){
        System.out.println("删除请求");
    }
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serviceList.size());
        return serviceList.get(i);
    }
}
