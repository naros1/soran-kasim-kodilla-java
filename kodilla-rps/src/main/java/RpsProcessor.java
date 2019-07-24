import java.util.Random;
import java.util.Scanner;

public class RpsProcessor {

    public void Game(String keyPressed, Player player, Computer computer, int playerCall) {


        System.out.println(player.getName() + " :");

        Random randomNumber = new Random();
        int computerCall = randomNumber.nextInt(100);

        if ("1".equals(keyPressed)) {
            System.out.println("Kamien");
            playerCall = 1;
            if (computerCall < 25) {
                computerCall = 1;
            } else if (computerCall < 50) {
                computerCall = 2;
            } else {
                computerCall = 3;
            }
        }
        if ("2".equals(keyPressed)) {
            System.out.println("Papier");
            playerCall = 2;
            if (computerCall < 25) {
                computerCall = 3;
            } else if (computerCall < 50) {
                computerCall = 2;
            } else {
                computerCall = 1;
            }
        }
        if ("3".equals(keyPressed)) {
            System.out.println("Nozyce");
            playerCall = 3;
            if (computerCall < 25) {
                computerCall = 3;
            } else if (computerCall < 50) {
                computerCall = 1;
            } else {
                computerCall = 2;
            }
        }

        System.out.println(computer.getName() + " :");

        if (computerCall == 1) {
            System.out.println("Kamien");
        }
        if (computerCall == 2) {
            System.out.println("Papier");
        }
        if (computerCall == 3) {
            System.out.println("Nozyce");
        }

        if (playerCall == 1 & computerCall == 3) {
            player.addWin();
        } else if (playerCall == 1 & computerCall == 2) {
            computer.addWin();
        } else if (playerCall == 1 & computerCall == 1) {
            System.out.println("\nRemis!!!\n");

        }

        if (playerCall == 2 & computerCall == 1) {
            player.addWin();
        } else if (playerCall == 2 & computerCall == 3) {
            computer.addWin();
        } else if (playerCall == 2 & computerCall == 2) {
            System.out.println("\nRemis!!!\n");
        }

        if (playerCall == 3 & computerCall == 2) {
            player.addWin();
        } else if (playerCall == 3 & computerCall == 1) {
            computer.addWin();
        } else if (playerCall == 3 & computerCall == 3) {
            System.out.println("\nRemis!!!\n");

        }
    }
}

