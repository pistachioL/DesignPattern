package commandPattern;

public class ExitCommand extends Command {
    private SystemExitClass seObj;
    public ExitCommand() {
        this.seObj = new SystemExitClass();
    }
    @Override
    public void execute() {
        seObj.exit();
    }
}
