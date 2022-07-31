package javaprograms;

import java.util.Random;

public class GenerateRandNums {

    public static void main(String[] args) {

        //Random class
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        System.out.println(rand_int);
        //approach2
        double rand_db = rand.nextDouble(); //range is 0.0 to 1.0
        System.out.println(rand_db);
        //3rd approach
        System.out.println(Math.random()); //only decimals

    }

}
