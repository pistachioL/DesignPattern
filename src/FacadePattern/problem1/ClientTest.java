package FacadePattern.problem1;

public class ClientTest {
    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt("src/FacadePattern/problem1/src.txt","src/FacadePattern/problem1/des.txt");

    }
}
