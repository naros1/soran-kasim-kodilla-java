import java.util.Random;
import java.util.Scanner;



public class Rps implements Text {

    public void rpsProcessor(){


        int roundNumber = 0;
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        int playerCall = 0;
        int count = 0;


        System.out.println("Podaj swoje imie : ");
        String playerName = scanner.nextLine();
        System.out.println("Podaj liczbe rund do rozegrania :");
        int rounds = scanner.nextInt() - 1;

        Player player = new Player(playerName, 0);
        Computer computer = new Computer("Computer", 0);
        RoundToPlay roundToPlay = new RoundToPlay(rounds);
        RpsProcessor rpsProcessor = new RpsProcessor();

        Text.instruction();



        while (!end) {


            if (roundNumber <= roundToPlay.getRoundsToPlay()) {

                if (count >= 1) {
                    System.out.println("Wciśnij klawisz :");
                }

                String keyPressed = scanner.nextLine();

                if ("1".equals(keyPressed) || "2".equals(keyPressed) || "3".equals(keyPressed) || "x".equals(keyPressed) || "n".equals(keyPressed)){

                    if ("x".equals(keyPressed)) {
                        end = Text.exitGame(scanner);
                    }
                    if ("n".equals(keyPressed)) {
                        end = Text.startNewGame(scanner);
                    }

                    if ("1".equals(keyPressed) || "2".equals(keyPressed) || "3".equals(keyPressed)) {
                        rpsProcessor.game(keyPressed, player, computer, playerCall);
                        roundNumber = roundNumber + 1;
                    }

                } else {
                    if (count >= 1) {
                        System.out.println("!!! WCISNIJ POPRAWNY KLAWISZ Z INSTRUKCJI !!!");
                    }
                }
            } else {
                System.out.println("Gra zakończona !!!\n" + computer.getName() + " : " + computer.getWins() + " | " + player.getName() + " : " + player.getWins());
                end = true;
            }
            count ++;
        }
    }
}




