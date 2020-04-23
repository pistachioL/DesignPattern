package adapter.doubleAdapter;

import adapter.doubleAdapter.impl.Cat;

public class AnimalAdapter implements Icat,Idog{
     public Icat icat = null;
     public Idog idog;
    AnimalAdapter(Icat icat,Idog idog){
        this.icat = icat;
        this.idog = idog;
    }
    @Override
    public void cryLikeDog() {
        System.out.println("我是猫，能学狗叫：汪汪汪");
    }

    @Override
    public void catchMouse() {
        System.out.println("我是狗能学猫抓老鼠");
    }
}
