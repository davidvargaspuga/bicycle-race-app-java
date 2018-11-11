import java.util.*;
/**
 * This class models a specific race that holds different racers.
 * @author (David Vargas Puga)
 * @version (09/01/2018)
 */
public class Race
{
    private Racer[] Race; //initialize array that holds racers.
    private int numRacers, maxRaceSize; //intitialize instance variables.
    int totalAge, youngest, oldest, i; //initialize instance variables regarding to age.
    double average; //initialize instance variable for average age.
    
    //constructor for a new Race that checks the paramater passed to determine that amount of the Race.
    public Race (int maxRaceSize){
        if (maxRaceSize <= 0){
            this.maxRaceSize = 50;
        }
        else{
            this.maxRaceSize = maxRaceSize;
        }
        Race = new Racer [this.maxRaceSize];//creates an array that holds the racers with the length of the parameter passed.
        numRacers = 0;
    }
    
    //method to add a new racer to a certain race.
    public int addRacer (Racer racer){
        //checks to see if there's space in the race to add a racer.
        if(numRacers >= this.maxRaceSize){
            System.out.println("Cannot add another racer to Race. Maximum number of racers reached.");
            return -1;
        }
        else{
            //adds the racer passed to the array.
            Race[numRacers] = racer;
            numRacers++;
            return 0;
        }
    }
    
    //method that prints the information about the race, including the racers.
    public void printRace(){
        System.out.print("Race Participants:\n");
        //initializes instance variables used in finding the average, min, max.
        int oldest = 0;
        int youngest = 100;
        int sumOfAges = 0;
        for (i = 0; i< numRacers;i++)
        {
            int age = Race[i].getAge();
            //compares the ages in order to determine the maximum and minimum.
            if (Race[i] != null)
            {
                Race[i].print();
                if (age < youngest)
                {
                    youngest = age;
                }
                if (age > oldest)
                {
                    oldest = age;
                }
                sumOfAges = sumOfAges + age;
            }
        }
        //determines the average and prints youngest, oldest, and average age.
        average = sumOfAges/numRacers;
        System.out.println("Average: " + average + " Youngest: " + youngest + " Oldest: " + oldest);
    }
}
