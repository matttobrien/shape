public class rectangle extends shape {
    private double length = 0;
    private double width = 0;

    /**
     * constructor
     * @param id
     * @param l
     * @param len
     * @param w
     */
    public rectangle(int id, String l, double len, double w){
        super(id, l);
        setLength(len);
        setWidth(w);
    }

    /**
     * setter for length
     * @param len
     */
    private void setLength(double len) {
        if(len != 0){
            this.length = len;
        }
    }

    /**
     * setter for width
     * @param w
     */
    private void setWidth(double w) {
        if(w != 0){
            this.width = w;
        }
    }

    /**
     * getter for length
     * @return
     */
    public double getLength() {
        return length;
    }

    /**
     * getter for width
     * @return
     */
    public double getWidth() {
        return width;
    }

    /**
     * calculates the area of a rectangle
     * @return
     */
    public double CalculateArea(){
        double area = 0;
        if (getLength() != 0 && getWidth() != 0){
            area = getLength() * getWidth();
        }
        return Math.round(area * 100.00) / 100.00;
    }

    @Override
    public String toString() {
        return "label = " + super.getLabel() + ", unique id = " + super.getUnique_id() +
                ", length = " + length + ", width = " + width +
                ", and area = " + CalculateArea();
    }
}
