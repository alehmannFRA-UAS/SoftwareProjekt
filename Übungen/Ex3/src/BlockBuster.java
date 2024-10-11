public class BlockBuster extends Movie {

    private boolean is3D;
    private boolean overLength;

    public BlockBuster(String title, ProductionCompany productionCompany, boolean is3D, boolean overLength) {
        super(title, productionCompany);
        this.is3D = is3D;
        this.overLength = overLength;
    }

    public boolean is3D() {
        return is3D;
    }

    public boolean isOverLength() {
        return overLength;
    }

    @Override
    public long getDuration() {
        if (is3D) {
        	return super.duration + 20;
        }
        if (overLength) {
        	return super.duration + 30;
        }
        return super.duration;
    }
    
}
