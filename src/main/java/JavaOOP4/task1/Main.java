package JavaOOP4.task1;

abstract class Shape{
    public  abstract void draw ();
}

class Circle extends Shape {
   public void draw (){System.out.println("Круг"); }
}
class Rectangle extends Shape {
    @Override
    public void draw() { System.out.println("Прямоугольник"); }
}


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.draw();
        r.draw();
    }
}
