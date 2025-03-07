public class Plant extends BasePlant {

    public Plant(String name, int growthTime, int waterNeeds, int sunlightNeeds) {
        super(name, growthTime, waterNeeds, sunlightNeeds);
    }

    @Override
    public void grow() {
        currentGrowthStage++;//for growing plant
    }
}
