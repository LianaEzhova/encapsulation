public class Dimensions {

    private final int height;
    private final int width;
    private final int length;

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }



    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int volume (int height, int width, int length) {
        int volume = height * width * length;
        return volume;
    }

    public String toString(){
        return " Height: "+height +
                " Width:"+width +
                " Length:"+length +
                " Volume: " + volume(height, width, length);
    }
}
