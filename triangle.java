public class triangle extends shape {
    double base = 0;
    double height = 0;

    /**
     * constructor
     * @param id
     * @param l
     * @param b
     * @param h
     */
    public triangle(int id, String l, double b, double h){
        super(id, l);
        setBase(b);
        setHeight(h);
    }

    /**
     * setter for base
     * @param b
     */
    private void setBase(double b) {
        if(b != 0){
            this.base = b;
        }
    }

    /**
     * setter for height
     * @param h
     */
    private void setHeight(double h) {
        if(h != 0){
            this.height = h;
        }
    }

    /**
     * getter for base
     * @return
     */
    public double getBase() {
        return base;
    }

    /**
     * getter for height
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * calculates the area of a triangle
     * @return
     */
    public double CalculateArea(){
        double area = 0;
        if(getBase() != 0 && getHeight() != 0){
            area = ((getBase())*(getHeight()))/2;
        }
        return Math.round(area * 100.00) / 100.00;
    }

    @Override
    public String toString() {
        return "label = " + super.getLabel() + ", unique id = " + super.getUnique_id() +
                ", base = " + base +
                ", height = " + height +
                ", and area = " + CalculateArea();
    }
}
