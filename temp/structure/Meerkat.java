package structure;
// File: Meerkat.java
import java.util.*;
public class Meerkat{
    
    double weight;
    double height;

    public void getWeight() {
        System.out.println("******The weight of the meerkat is: " + weight + " kg");
    }   
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getHeight() {
        System.out.println("******The height of the meerkat is: " + height + " cm");
    }
    public void setHeight(double height) {
        this.height = height;
    }
}