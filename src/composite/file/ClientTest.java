package composite.file;

public class ClientTest {
    public static void main(String[] args) {
        AbstractFile imageFile = new ImageFile("花.jpg");
        AbstractFile imageFile1 = new ImageFile("天气.jpg");
        imageFile.display();

        AbstractFile textFile = new TextFile("笔记.txt");
        textFile.display();

        AbstractFile vedioFile = new VedioFile("音频文件.mp3");
        vedioFile.display();

        AbstractFile folder = new Folder("文件夹");
        folder.add(textFile);
        folder.add(imageFile1);
        folder.add(imageFile);
        folder.add(vedioFile);
        folder.display();

    }
}
