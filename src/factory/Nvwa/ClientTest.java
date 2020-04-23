package factory.Nvwa;

public class ClientTest {
    public static void main(String args[]) throws  Exception{
        Person person;
        String gender = XMLUtilGender.getGender();
        person = PersonFactory.makePerson(gender);
        person.MakePerson();
    }
}
