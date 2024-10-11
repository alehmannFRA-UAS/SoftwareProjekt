public class Comedy extends Movie {

    private boolean hasSuperstar;

    public Comedy(String title, ProductionCompany productionCompany, boolean hasSuperstar) {
        super(title, productionCompany);
        this.hasSuperstar = hasSuperstar;
    }

    public boolean hasSuperstar() {
        return hasSuperstar;
    }

    @Override
    public long getDuration() {
        if(hasSuperstar) {
        	return super.duration + 30;
        }
        return super.duration;
    }

}
