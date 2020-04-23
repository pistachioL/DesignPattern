package composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends  AbstractFile {
    List<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String fileName;
    public Folder(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void add(AbstractFile element) {
        fileList.add(element);
    }

    @Override
    public void remove(AbstractFile element) {
        fileList.add(element);
    }

    @Override
    public void display() {
        System.out.println("----------文件夹中的文件：---------");
        for(AbstractFile file : fileList){
            file.display();
        }
    }
}
