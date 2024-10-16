package interfaceImplements;

public class Fish implements Swimmer {
    
    @Override
    public void swim() {
        System.out.println("the fish is swimming");
    }
}
