public class Dimension extends Producer {

    int high;
    int width;
    int tankCapacity;

    public Dimension(String name, String model, int high, int width, int tankCapacity) {
        super(name, model);
        this.high = high;
        this.width = width;
        this.tankCapacity = tankCapacity;
    }




    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
