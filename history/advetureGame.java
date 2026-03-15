import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;

        do {
            System.out.println("=== The Lost Sword ===");
            System.out.println("You are Arin, standing before a glowing sword stuck in stone.");
            System.out.println("What will you do?");
            System.out.println("1. Pull the sword from the stone.");
            System.out.println("2. Leave it and walk deeper into the forest.");
            System.out.println("3. Set up camp and rest near the sword.");
            System.out.print("Choose 1, 2, or 3: ");

            int choice = input.nextInt();
            input.nextLine();

            System.out.println();

            if (choice == 1) {
                System.out.println("You pull the sword... but the ground crumbles beneath you!");
                System.out.println("You fell off the cliff and plummeted to your death. Sorry...");
                System.out.print("Press [y] to restart: ");
            } else if (choice == 2) {
                System.out.println("You wander deeper and find glowing berries. You eat them...");
                System.out.println("You ate some berries and didn't die. Peeta is that you?");
                System.out.print("Press [y] to play again: ");
            } else if (choice == 3) {
                System.out.println("You rest by the sword. In your dreams, the sword speaks to you...");
                System.out.println("The computer says you live on!");
                System.out.print("Press [y] to restart: ");
            } else {
                System.out.println("Invalid choice. The forest consumes you...");
                System.out.print("Press [y] to try again: ");
            }

            playAgain = input.nextLine();
            System.out.println();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Game over!");
        input.close();
    }
}
