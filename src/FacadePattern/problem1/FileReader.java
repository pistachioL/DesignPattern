package FacadePattern.problem1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String fileNameSrc){
        System.out.println("读取文件中......");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileNameSrc);
            boolean text;
            while(text = fileInputStream.read() != -1){
                sb = sb.append(text);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到该文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件操作有误！");
            e.printStackTrace();
        }
        return sb.toString();
    }
}
