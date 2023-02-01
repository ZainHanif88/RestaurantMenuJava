import java.util.ArrayList;
import java.util.Scanner;

public class Fooddishes {

    public void hungrySounds() {
        System.out.println("Yes ! We got the Order!");
    }

    ArrayList<String> Fooddishes = new ArrayList<String> ();
    Scanner addFooddishes = new Scanner(System.in);
    Scanner prepareFooddishes = new Scanner(System.in);

    public void addFooddishes() {
        System.out.println("Add dish:");
        Fooddishes.add(addFooddishes.next());

        System.out.println("Dish added:");
        System.out.println(Fooddishes);
    }

    public void listAllFooddishes() {
        System.out.println("Food Dishes!");
    }

    public void endProgram() {
        System.out.println("Program Ended!");
        System.exit(0);
    }

}
