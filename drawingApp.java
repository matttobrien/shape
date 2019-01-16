import java.util.Random;
import java.util.Arrays;

public class drawingApp{
    public static void main(String[] args) {
        int id = 0;
        shape[] Array = new shape[10];
        Array[0] = new circle(++id,"Circle", randomNumber());
        Array[1] = new rectangle(++id,"Rectangle", randomNumber(), randomNumber());
        Array[2] = new triangle(++id, "Triangle", randomNumber(), randomNumber());
        Array[3] = new circle(++id,"Circle", randomNumber());
        Array[4] = new rectangle(++id,"Rectangle", randomNumber(), randomNumber());
        Array[5] = new triangle(++id, "Triangle", randomNumber(), randomNumber());
        Array[6] = new circle(++id,"Circle", randomNumber());
        Array[7] = new rectangle(++id,"Rectangle", randomNumber(), randomNumber());
        Array[8] = new triangle(++id, "Triangle", randomNumber(), randomNumber());
        Array[9] = new circle(++id,"Cirlce", randomNumber());
        for (int i = 0; i < 10; i++){
            System.out.println(Array[i]);
        }
        //sorts the Array by Area using the compareTo in shape
        Arrays.sort(Array);
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 10; i++){
            System.out.println(Array[i]);
        }
    }

    /**
     * generates random numbers
     * @return
     */
    public static int randomNumber(){
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        return randNum;
    }

}
