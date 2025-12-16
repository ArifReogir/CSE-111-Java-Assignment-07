public class shapeTester {
  public static void main(String[] args) {
    Shape s = new Shape();
    s.name = "Mobius Strip";
    s.color = "Blue";
    s.displayInfo();
    System.out.println("1=======================");
    Circle c = new Circle();
    System.out.println("2=======================");
    c.name = "Circle";
    c.color = "Red";
    c.radius = 5;
    c.displayInfo();
    System.out.println("3=======================");
    c.area();
  }
}

//Class Starts from here

class Shape {
  public String name;
  public String color;

  public void displayInfo() {
    System.out.printf("Name: %s\nColor: %s\n", name, color);
  }
}

 class Circle extends Shape {
    public double radius;
    public double area;

    public void area(){
        area=3.1416*radius*radius;
        System.out.println("Area of Red Circle: "+area);
    }
}
