package observerPattern;
import java.text.MessageFormat;

public class ConcreteAlliance extends AbsAlliance{
    public ConcreteAlliance(String allyName) {
        System.out.println(allyName + "组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    public void notify(String name) {
        System.out.println(this.allyName + "紧急通知，盟友" + name + "遭受敌人攻击！");
        System.out.println();
        for(Object obs : players) {
            if (!((Observer)obs).getName().equalsIgnoreCase(name)) {
                ((Observer)obs).help();
            }
        }
    }

}
