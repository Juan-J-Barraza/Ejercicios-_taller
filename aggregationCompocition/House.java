package aggregationCompocition;

public class House {
    private Dor dor;

    public House() {

    }

    public House(Dor dor) {
        if (dor == null) {
            throw new IllegalArgumentException("can not null");
        }
        this.dor = dor;
    }

    public void modificationDor(Dor dor) {
        if (dor == null) {
            throw new IllegalArgumentException("can not null");
        }
        this.dor = dor;
    }

    public void deleteDor(Dor dor) {
        throw new IllegalArgumentException("can not delete the dor");
    }
    
    public Dor getDor() {
        return this.dor;
    }

    public void setDor(Dor dor) {
        this.dor = dor;
    }

}
