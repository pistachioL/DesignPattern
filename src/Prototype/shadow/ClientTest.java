package Prototype.shadow;

public class ClientTest {
    public static void main(String[] args){
        Email email,copyEmail;
        email = new Email();
        copyEmail = (Email) email.clone();
        System.out.print("email == copyEmail?");
        System.out.println(email == copyEmail);
        System.out.print("email.emailTitle == copyEmail.emailTitle?");
        System.out.println(email.emailTitle == copyEmail.emailTitle);
        System.out.print("email.emailLevel == copyEmail.emailLevel?");
        System.out.println(email.emailLevel == copyEmail.emailLevel);
    }
}
