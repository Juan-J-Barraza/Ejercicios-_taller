package inheritance;

public class Dog extends Animal {
    
    public void makesound() {
        super.makesound();
        System.out.println("the dog is braking");
    }

    public void eat() {
        System.out.println("the dog is eating");
    }
}
