package interfaceImplements;

public class Cat extends Animal {

    public Cat() {
        super.sound = "Miau";
    }

    @Override
    public void makesound() {
        super.makesound();
        System.out.println("the cat is meowing");
    }
}
