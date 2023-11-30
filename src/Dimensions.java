public class Dimensions {

    private final int height;
    private final int width;
    private final int length;

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int volume (int height, int width, int length) {
        int volume = height * width * length;
        return volume;
    }
}
