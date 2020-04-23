package commandPattern;

public class FunctionButton {  //请求调用者
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        System.out.println("-------点击按钮操作-------");
        command.execute();
    }
}
