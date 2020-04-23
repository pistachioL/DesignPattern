package composite.file;

public class VedioFile extends AbstractFile{
    private String fileName;
    public VedioFile(String fileName) {
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
        System.out.println("VeidoFile add");
    }

    @Override
    public void remove(AbstractFile element) {
        System.out.println("VedioFile remove");
    }

    @Override
    public void display() {
        System.out.println("音频文件:" + getFileName());
    }
}
