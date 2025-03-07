interface Plantable {

    BasePlant[] PLANTS = new BasePlant[10];

    //method to grow plant
    void grow();

    //method to water plant
    void water();

    //method to check if plant can be harvested
    boolean isHarvestable();

    // grabs name of plant
    String getName();

}
