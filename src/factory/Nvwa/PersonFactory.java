package factory.Nvwa;

public class PersonFactory {
    public static Person makePerson(String gender) throws Exception{
        if(gender.equalsIgnoreCase("M")){
            System.out.println("女娲造了一个男孩子");
            return new Man();
        }
        else if(gender.equalsIgnoreCase("W")){
            System.out.println("女娲造了一个女孩子");
            return new Women();
        }
        else if(gender.equalsIgnoreCase("R")){
            System.out.println("女娲造了一个机器人");
            return new Robot();
        }
        else{
            throw new Exception("错误,女娲并没有造人");
        }
    }
}
