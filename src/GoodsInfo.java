public class GoodsInfo {

    private final Dimensions dimensions;
    private final int mass;
    private final String address;
    private final boolean flip;
    private final String number;
    private final boolean fragile;


    public GoodsInfo(Dimensions dimensions, int mass, String address,boolean flip, String number,boolean fragile){
            this.dimensions = dimensions;
            this.mass = mass;
            this.address = address;
            this.flip = flip;
            this.number = number;
            this.fragile = fragile;
        }



    public Dimensions getDimensions() {
        return dimensions;
    }

    public GoodsInfo setDimensions(Dimensions dimensions) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public int getMass() {
        return mass;
    }

    public GoodsInfo setMass(int mass) {
        return  new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public String getAddress() {
        return address;
    }

    public GoodsInfo setAddress(String address) {
        return  new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public boolean isFlip() {
        return flip;
    }

    public GoodsInfo setFlip(boolean flip) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public String getNumber() {
        return number;
    }

    public GoodsInfo setNumber(String number) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public GoodsInfo setFragile(boolean fragile) {
        return new GoodsInfo(dimensions, mass, address, flip, number, fragile);
    }

    public String toString(){
        return "Dimensions: "+dimensions.toString()+
                " Mass:"+mass+
                " Address"+address+" Flip:"+flip+
                " Number:"+number+" Fragle:" +fragile;
    }

}
