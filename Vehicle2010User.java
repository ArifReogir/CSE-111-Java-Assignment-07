public class Vehicle2010User {
    public static void main(String[] args) {
        Vehicle2010 car1 = new Vehicle2010();
        System.out.println(car1.getPosition());
        car1.moveLowerLeft();
        System.out.println(car1.getPosition());
        Vehicle2010 car2 = new Vehicle2010();
        System.out.println(car2.getPosition());
        car2.moveUpperRight();
        System.out.println(car2.getPosition());
        car2.moveLowerRight();
        System.out.println(car2.getPosition());
    }
}

// class starts here

class Vehicle {
    public int x;
    public int y;

    public void moveUp() {
        y = y + 1;
    }

    public void moveDown() {
        y = y - 1;
    }

    public void moveLeft() {
        x = x - 1;
    }

    public void moveRight() {
        x = x + 1;
    }

    public String getPosition() {
        return "(" + x + "," + y + ")";
    }
}

class Vehicle2010 extends Vehicle {

    public void moveLowerLeft() {
        moveDown();
        moveLeft();
    }

    public void moveUpperRight() {
        moveRight();
        moveUp();
    }

    public void moveLowerRight() {
        moveRight();
        moveDown();
    }
}
