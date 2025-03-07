public class Gardener {
    private final String name;
    private PlantSet garden;

    public Gardener(String name) {
        this.name = name;
        this.garden = new PlantSet();
    }

    public String getName() {
        return name;
    }

    public void plant(BasePlant plant) {
        garden.addPlant(plant);
    } // plants

    public void waterPlants() { // waters plants
        for (int i = 0; i < garden.getNumPlants(); i++) {
            garden.getPlant(i).water();
        }
    }

    public void checkGrowth() {//checks growth
        for (int i = 0; i < garden.getNumPlants(); i++) {
            garden.getPlant(i).grow();
        }
    }

    public void harvest() {
        for (int i = 0; i < garden.getNumPlants(); i++) {
            if (garden.getPlant(i).isHarvestable()) {
                System.out.println("Harvesting " + garden.getPlant(i).getName());
                //to harvest plant
            }
        }
    }
}
