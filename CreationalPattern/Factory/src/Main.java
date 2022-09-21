public class Main {
    public static void main(String[] args) {

        shapeFactory shapefactory=new shapeFactory();
        shapefactory.getShape("Circle").draw();

        shapefactory.getShape("Rectangle").draw();

        shapefactory.getShape("Square").draw();
    }
}