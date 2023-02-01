import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fooddishes fd = new Fooddishes();      //objekt

        System.out.println("Press 0 to exit program\nPress 1 twice to add dish\npress 2 to list all dishes\nPress 3 to create new dish object");

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter num");
        int in = -1;
        while (in != 0){
            System.out.println("press 1 to add another dish, press 2  to list added dishes,\n press 3 to have an inherited object do something or 0 to exit application");
            in = userInput.nextInt();
            if(in==1){
                fd.addFooddishes();
            } else if(in==2){
                fd.listAllFooddishes();
            }else if(in==3){
                MumsCurry gul = new MumsCurry();
                gul.hungrySounds();
            } else if (in==0){
                fd.endProgram();
            }

        }



    }

}