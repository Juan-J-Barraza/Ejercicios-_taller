package aggregationCompocition;

public class Computer {
    private Processor processor;

    public Computer() {
        this.processor = new Processor();
    }

    public void start() {
        if (processor == null) {
            System.out.println("no contain processor");
        }
        processor.start();
    }

    public void endProcessor(Processor pro) {
        if (pro == null) {
            System.out.println("processor not start");
        }
        pro.end();
        System.out.println("finish section computer");
    }

    public void deleteProcessor(Processor pro) {
        pro.delete();
        System.out.println("removing processor");
    }

    public void keepComputer() {
        processor.refreshProcess();
        System.out.println("refres this pc");
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

}
