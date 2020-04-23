package adapter.doubleAdapter;

import adapter.doubleAdapter.impl.Cat;
import adapter.doubleAdapter.impl.Dog;

public class ClientTest {
    public static void main(String[] args) {
        AnimalAdapter animalAdapter = new AnimalAdapter(new Cat(),new Dog());
        animalAdapter.catchMouse();
        animalAdapter.cryLikeDog();
    }
}
