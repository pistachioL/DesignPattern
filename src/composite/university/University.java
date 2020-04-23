package composite.university;

import java.util.ArrayList;
import java.util.List;
//University相当于Composite 可以管理College
public class University extends OrganizationComponent {
    //存放College  与OrganizationComponent形成聚合关系，把其对象关联进来
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    //构造器
    public University(String name, String des) {
        super(name, des);
    }

    //重写add方法
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }


    //输出University中的学院
    @Override
    protected void print() {
        System.out.println(getName());
        for(OrganizationComponent organizationComponent : organizationComponentList){
            organizationComponent.print();
        }
    }
}
