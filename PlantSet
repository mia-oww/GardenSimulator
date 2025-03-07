public class PlantSet{
    private final int MAX_PLANTS;
    private int numPlants;
    private BasePlant[] set;

    public PlantSet() {
        MAX_PLANTS = 10;
        numPlants = 0;
        set = new BasePlant[MAX_PLANTS];
    }// maximum of 10 plants can be planted

    public void addPlant(BasePlant plant){
        if (numPlants <MAX_PLANTS) {
            set[numPlants++] =plant;
        } else {
            System.out.println("Full! Cannot add more plants!!");
        }
    }

    public int getNumPlants() {
        return numPlants;
    }
//retrieves plant from collection from index
    public BasePlant getPlant(int index){
        if (index >= 0 &&index<numPlants){//if index is within range
            return set[index];//return plant at specified index
        }
        return null;//no plant exists
    }

}
