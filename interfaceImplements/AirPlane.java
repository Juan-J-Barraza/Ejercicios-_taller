package interfaceImplements;

public class AirPlane extends Vehicle {
    
    @Override
    public void move() {
        super.move();
        System.out.println("the airplane is moving");
    }
}
