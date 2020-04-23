package FacadePattern.problem2;

public class ClientTest {
    public static void main(String[] args) {
        AbsEncryptFacade absEncryptFacade = new EncryptFacade();
        absEncryptFacade.fileEncrypt("src/FacadePattern/problem2/src.txt","src/FacadePattern/problem2/des.txt");

        AbsEncryptFacade absEncryptFacade1 = new newEncryFacade();
        absEncryptFacade1.fileEncrypt("src/FacadePattern/problem2/src.txt","src/FacadePattern/problem2/des.txt");

    }
}
