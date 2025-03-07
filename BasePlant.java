public abstract class BasePlant implements Plantable {
    protected final String name;

    // in days
    protected final int growthTime;

    //in liters
    protected final int waterNeeds;

    // in hours
    protected final int sunlightNeeds;

    protected int currentGrowthStage;

    public BasePlant(String name, int growthTime, int waterNeeds, int sunlightNeeds) {
        this.name = name;
        this.growthTime = growthTime;
        this.waterNeeds = waterNeeds;
        this.sunlightNeeds = sunlightNeeds;
        this.currentGrowthStage = 0;// growth stage 0
    }

    public String getName() {
        return name;
    }

    public abstract void grow();

    public void water() {
        // for watering plant
    }

    public boolean isHarvestable() {
        return currentGrowthStage >= growthTime;
    } // checks if plant is ready to be harvested
}
