import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    List<Shape> shapeList=new ArrayList<Shape>();

    @Override
    public void draw(String color) {
        for (Shape shape:shapeList
             ) {
            shape.draw(color);
        }
    }

    public void add(Shape shape){
        shapeList.add()
    }
}
