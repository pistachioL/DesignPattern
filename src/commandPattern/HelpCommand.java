package commandPattern;

public class HelpCommand extends Command {
    private DisplayHelpClass hcObj;  //这个对象的类与本类时关联关系

    public HelpCommand() {
        this.hcObj = new DisplayHelpClass();
    }

    @Override
    public void execute() {
        hcObj.display();
    }
}
