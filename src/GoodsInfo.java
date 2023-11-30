public class GoodsInfo {

    private final Dimensions dimensions;
    private final int mass;
    private final String address;
    private final boolean flip;
    private final String number;
    private final boolean fragile;



    public GoodsInfo(Dimensions dimensions, int mass, String address, boolean flip, String number, boolean fragile) {
        this.dimensions = dimensions;
        this.mass = mass;
        this.address = address;
        this.flip = flip;
        this.number = number;
        this.fragile = fragile;
    }

    public GoodsInfo setDimensions(Dimensions dimensions) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public GoodsInfo setMass(int mass) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public GoodsInfo setAddress(String address) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }



}
