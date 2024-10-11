public abstract class Movie {

    protected long duration;
    private String title;
    private ProductionCompany productionCompany;

    public Movie(String title, ProductionCompany productionCompany) {
        this.title = title;
        this.productionCompany = productionCompany;
    }

    public abstract long getDuration();
    
    public String getTitle() {
        return title;
    }

    public ProductionCompany getProductionCompany() {
        return productionCompany;
    }

}
