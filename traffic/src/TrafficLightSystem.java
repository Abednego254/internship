import java.util.Scanner;

public class TrafficLightSystem {
    Scanner sc = new Scanner(System.in);

    public void displayInstructions() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light colour: ");
        String color = sc.nextLine().toLowerCase();

        String action;
        switch (color) {
            case "red", "blinking red" -> action = "Stop";
            case "yellow" -> action = "Prepare to Stop";
            case "green" -> action = "Go";
            case "blinking yellow" -> action = "Proceed with caution";
            default -> {
                System.out.println("Invalid color");
                return;
            }
        }
        System.out.print("What to do? Do this: "+action);
    }
}
