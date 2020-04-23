package Prototype.deep;

public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Email email = new Email();
        Email copyEmail = (Email) email.clone();
        System.out.println("copyEmail.emailTitle == email.emailTitle?");
        System.out.println(copyEmail.emailTitle == email.emailTitle);
        System.out.println("copyEmail.emailLevel == email.emailLevel?");
        System.out.println(copyEmail.emailLevel == email.emailLevel);
    }
}
