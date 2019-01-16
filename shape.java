/**
 * calculates the area of various shapes
 * @author mattobrien
 * @version 1
 */

public abstract class shape implements Comparable<shape>{
    protected int unique_id;
    protected String label;

    /**
     * default constructor
     */
    public shape(){
        unique_id = 0;
        label = "unknown";
    }

    /**
     * overloaded constructor
     * @param id
     * @param label
     */
    public shape(int id, String label){
        this();
        setID(id);
        setLabel(label);
    }

    /**
     * setter for id
     * @param id
     */
    private void setID(int id) {
        if(label.length() != 0){
            this.unique_id = id;
        }
    }

    /**
     * setter for label
     * @param label
     */
    private void setLabel(String label) {
        if(label.length() != 0){
            this.label = label;
        }
    }

    /**
     * getter for id
     * @return
     */
    public int getUnique_id() {
        return unique_id;
    }

    /**
     * getter for label
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * abstract method
     * @return
     */
    abstract double CalculateArea();

    /**
     * override compareTo to compare Area
     * @param o
     * @return
     */
    @Override
    public int compareTo(shape o) {
        if(o.CalculateArea() > this.CalculateArea())
            return 1;
        else
            return -1;
    }
}
