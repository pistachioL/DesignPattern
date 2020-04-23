package FacadePattern.problem2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(String encryptText,String fileNameDes){
        System.out.println("保存加密文件......");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileNameDes);
            fileOutputStream.write(encryptText.getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到该文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件操作有误！");
            e.printStackTrace();
        }

    }
}
