
/**
 * Main class to test hw0 classes
 * Other classes include: Race and Racer that students should implement
 * 
 * CS 305, Fall 2018
 * @author Martin Cenek, Tammy VanDeGrift 
 * @version January 2018
 */
public class Main {
    public static void main(String[] args) {
        // create Race objects
        Race tdf = new Race(-3);  //should create a tour de france (tdf) Race with default of size 20 racers
        Race vuelta = new Race(2);
        
        // create items
        Racer mickey = new Racer(101, "Mickey Mouse", 18);
        Racer pluto = new Racer(333, "Pluto Disney", 16);
        Racer goofy = new Racer(222, "Goofy Diskey", 21);
        Racer daisy = new Racer(912, "Daisy Duke", 28);
        Racer mary = new Racer(124, "Mary Poppins", 41);
        Racer pink = new Racer(545, "Pinkalicious", 16);
        Racer huey = new Racer(322, "Huey Duck", 15);
        Racer dewey = new Racer(122, "Dewey Duck", 15);
        Racer louie = new Racer(111, "Louie Duck", 15);
        Racer peanut = new Racer(121, "Peanut Brown", 17);
        Racer froom = new Racer(1, "Chris Froom", 38);
        Racer contador = new Racer(201, "Alberto Contador", 40);
        
        // put some items into Race (scanned for checkout)
        tdf.addRacer(mickey);
        tdf.addRacer(pluto);
        tdf.addRacer(goofy);
        tdf.addRacer(daisy);
        
        // for write-up: draw a picture of what tdf's racer roster looks like
        
        // print Race
        tdf.printRace();
        
        // put more items into Race
        tdf.addRacer(mary);
        tdf.addRacer(pink);
        tdf.addRacer(huey);
        tdf.addRacer(dewey);
        
        // print Race
        tdf.printRace();
        
        // add items
        tdf.addRacer(louie);
        tdf.addRacer(peanut);
        
        // print Race
        tdf.printRace();
        
        // add riders to vuelta
        vuelta.addRacer(pluto);
        vuelta.addRacer(pink);
        vuelta.printRace();
        
        // add another item
        vuelta.addRacer(huey);
        
        // for write-up
        //System.out.println(vuelta);
        //System.out.println(tdf);
        
        return;
    }
}
