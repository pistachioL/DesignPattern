package composite.file;

public class TextFile extends AbstractFile{
    private String fileName;
    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void add(AbstractFile element) {
        System.out.println("TextFile : add");
    }

    @Override
    public void remove(AbstractFile element) {
        System.out.println("TextFile : remove");
    }

    @Override
    public void display() {
        System.out.println("文本文件:"+getFileName());
    }
}
