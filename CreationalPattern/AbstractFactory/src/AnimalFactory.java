import AnimalFamily.Bear;
import AnimalFamily.Dog;
import AnimalFamily.Duck;
import AnimalFamily.IAnimal;

public class AnimalFactory implements IAbstractFactory<IAnimal> {

    @Override
    public IAnimal create(String type) {
        if (type.equalsIgnoreCase("dog")){
            return new Dog();
        } else if (type.equalsIgnoreCase("duck")) {
            return new Duck();
        } else if (type.equalsIgnoreCase("bear")) {
            return new Bear();
        }
        return null;
    }
}
