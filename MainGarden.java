public class MainGarden {
    public static void main(String[] args) {
        //new garden, 2 gardeners
        Garden garden = new Garden(2);

        Gardener gardener1 = new Gardener("gardener 1");
        Gardener gardener2 = new Gardener("gardener 2");

        //add gardeners to garden
        garden.addGardener(gardener1);
        garden.addGardener(gardener2);
        garden.getGardenerCount();
        gardener1.plant(new Plant("tomato", 5, 2, 6));
        gardener1.plant(new Plant("carrot", 3, 1, 4));
        gardener2.plant(new Plant("rose", 7, 1, 8));

        for (int day = 1; day <= 10; day++) {
            System.out.println("Day " + day + ":");
            gardener1.waterPlants();
            gardener1.checkGrowth();
            gardener2.waterPlants();
            gardener2.checkGrowth();
            gardener1.harvest();
            gardener2.harvest();
        }

    }
}
