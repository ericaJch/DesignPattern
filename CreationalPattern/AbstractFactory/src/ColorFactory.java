import AnimalFamily.Dog;
import ColorFamily.Black;
import ColorFamily.Brown;
import ColorFamily.IColor;
import ColorFamily.White;

public class ColorFactory implements IAbstractFactory<IColor> {
    @Override
    public IColor create(String type) {
        if (type.equalsIgnoreCase("white")) {
            return new White();
        } else if (type.equalsIgnoreCase("brown")) {
            return new Brown();
        } else if (type.equalsIgnoreCase("black")) {
            return new Black();
        }
        return null;
    }
}
