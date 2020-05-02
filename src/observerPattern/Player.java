package observerPattern;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //支援盟友方法的实现
    public void help() {
        System.out.println(this.name + "收到，正在来救你路上");

    }

    @Override
    public void beAttacked(AbsAlliance acc) {
        System.out.println("我是" + this.name + ",我被攻击了！");
        acc.notify(name);

    }

}
