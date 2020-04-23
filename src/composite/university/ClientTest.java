package composite.university;

public class ClientTest {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学","顶级大学");

        OrganizationComponent computerCollege = new College("计算机工程学院","计算机工程学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院","信息工程学院");

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //创建各学院下的专业
        computerCollege.add(new Department("软件工程","软件工程"));
        computerCollege.add(new Department("网络工程","网络工程"));
        computerCollege.add(new Department("计算机科学与技术","计算机科学与技术"));

        infoEngineerCollege.add(new Department("信息工程","信息工程好学"));
        infoEngineerCollege.add(new Department("通信工程","通信工程不好学"));

        computerCollege.print();

    }
}
