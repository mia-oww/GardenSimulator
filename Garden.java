
public class Garden {

    private Gardener[] gardeners;
    private int gardenerCount;

    public Garden(int size) {
        gardeners = new Gardener[size];
        gardenerCount = 0;
    }

    public void addGardener(Gardener gardener) { // to add more gardeners to garden
        if (gardenerCount < gardeners.length) {
            gardeners[gardenerCount++] = gardener;
        } else {
            System.out.println("Garden is full! Cannot add more gardeners.");
        }
    }
    public int getGardenerCount() {
        return gardenerCount;
    }
}
