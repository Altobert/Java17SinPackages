package varsample;

public class Eat {

    public static void main(String ... args){
        System.out.println("Eat");
        boolean hungry = true;
        int ammountOfFood = 20;
        Eat eat = new Eat();
        eat.eatMore(hungry, ammountOfFood);
    }

    //humgry and amountOfFood son methods parameters, ellos 
    // estaran disponibles para todo el metodo.
    public void eatMore(boolean hungry, int ammountOfFood){
        int roomInBelly = 10;
        if(hungry){
            var timeToEat = true;
            while(ammountOfFood > 0 ){
                int ammountEaten = 2;
                roomInBelly = roomInBelly - ammountEaten;
                ammountOfFood = ammountOfFood - ammountEaten;

            }
            
        }
        System.out.println("Eating " + ammountOfFood);
    }    

}
