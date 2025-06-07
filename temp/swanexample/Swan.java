package swanexample;
public class Swan {
     int numberEggs; // instance variable
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs= 1;
        System.out.println("The number of eggs is: " + mother.numberEggs);
    }
}
