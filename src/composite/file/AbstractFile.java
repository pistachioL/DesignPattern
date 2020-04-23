package composite.file;

public abstract class AbstractFile {
    public void add(AbstractFile element){
        throw new UnsupportedOperationException();
    }
    public void remove(AbstractFile element){
        throw new UnsupportedOperationException();
    }
    public abstract void display();
}
