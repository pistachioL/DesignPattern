package iteratorPattern;

public interface MyIterator {
    public void next();
    public void previous();
    public boolean hasNext();
    public String curName();
    public boolean isLast();
    public boolean isFirst();

}
