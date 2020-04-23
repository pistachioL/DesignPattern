package composite.university;

public class Department extends OrganizationComponent{ //Department是叶子结点　不需要再实现add　remove方法
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName() + " " + getDes());
    }
}
