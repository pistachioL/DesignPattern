package composite.file;

public class ImageFile extends AbstractFile {
    private String fileName;
    public ImageFile(String fileName) {
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
        System.out.println("imageFile : add");
    }

    @Override
    public void remove(AbstractFile element) {
        System.out.println("imageFile : remove");
    }

    @Override
    public void display() {
        System.out.println("图像文件:" + getFileName());
    }
}
