package FacadePattern.problem2;

import FacadePattern.problem1.CipherMachine;
import FacadePattern.problem1.FileReader;
import FacadePattern.problem1.FileWriter;

public class EncryptFacade extends AbsEncryptFacade{

    private FacadePattern.problem2.FileReader reader;
    private FacadePattern.problem2.CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FacadePattern.problem2.FileReader();
        cipher = new FacadePattern.problem2.CipherMachine();
        writer = new FileWriter();
    }

    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        super.fileEncrypt(fileNameSrc, fileNameDes);
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr,fileNameDes);

    }



}
