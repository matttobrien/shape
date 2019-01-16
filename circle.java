import java.lang.Math;

public class circle extends shape {
    private double radius = 0;

    /**
     * constructor
     * @param id
     * @param l
     * @param r
     */
    public circle(int id, String l,double r){
        super(id, l);
        setRadius(r);
    }

    /**
     * setter for radius
     * @param r
     */
    private void setRadius(double r) {
        if(r != 0){
            this.radius = r;
        }
    }

    /**
     * getter for radius
     * @return
     */
    public double getRadius(){
        return radius;
    }

    /**
     * calculates the area of a circe
     * @return
     */
    public double CalculateArea() {
        double area = 0;
        if(getRadius() != 0){
            area = (Math.PI)*(Math.pow(getRadius(), 2));
        }
        return Math.round(area * 100.00) / 100.00;
    }

    @Override
    public String toString() {
        return "label = " + super.getLabel() + ", unique id = " + super.getUnique_id() +
                ", radius = " + radius + ", and area = " + CalculateArea();
    }
}
