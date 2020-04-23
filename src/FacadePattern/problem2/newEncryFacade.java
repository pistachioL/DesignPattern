package FacadePattern.problem2;


public class newEncryFacade extends AbsEncryptFacade {
    private FacadePattern.problem2.FileReader reader;
    private FacadePattern.problem2.CipherMachine cipher;
    private FacadePattern.problem2.FileWriter writer;

    public newEncryFacade() {
        reader = new FacadePattern.problem2.FileReader();
        cipher = new FacadePattern.problem2.CipherMachine();
        writer = new FacadePattern.problem2.FileWriter();
    }


    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        super.fileEncrypt(fileNameSrc, fileNameDes);
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr,fileNameDes);
    }
}
