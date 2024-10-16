package interfaceImplements;

public class Guitar extends Instrument implements Tuneable {
    
    @Override
    public void play() {
        System.out.println("Playing guitar");
    }

    @Override
    public void tune() {
        System.out.println("tuning  guitar");
    }
}
