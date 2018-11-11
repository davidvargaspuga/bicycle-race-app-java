
/**
 * The Racer class models a specific racer that could enter the race.
 *
 * @author (David Vargas Puga)
 * @version (09/01/2018)
 */
public class Racer
{
    //initializes instance variables regarding a racer.
    private int bibNumber, age;
    private String name;
    
    //constructor for a racer
    public Racer (int bibNumber, String name, int age){
        this.bibNumber = bibNumber;
        this.name = name;
        this.age = age;
    }
    
    //method to print the information about a racer.
    public void print(){
        System.out.println("Racer\t" + bibNumber +"\t" + name + "\t" + age);
    }
    
    //a getter method for the racer's age.
    public int getAge(){
        return age;
    }
    
}
