import java.util.Random;
import java.util.Scanner;



public class Rps {

    public void rpsProcessor(){


        String exit;
        int roundNumber = 0;
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int playerCall = 0;
        int computerCall = 0;

        System.out.println("Podaj swoje imie : ");
        String playerName = scanner.nextLine();
        System.out.println("Podaj liczbe rund do rozegrania :");
        int rounds = scanner.nextInt();

        Player player = new Player(playerName, 0);
        Computer computer = new Computer("Computer", 0);
        RoundToPlay roundToPlay = new RoundToPlay(rounds);


        System.out.println(
                "Obsługa gry : \n" + "klawisz 1 - zagranie \"kamien\"\n" +
                        "klawisz 2 - zagranie \"papier\"\n" + "klawisz 3 - zagranie \"nożyce\"\n" +
                        "klawisz x - zakonczenie gry\n" + "klawisz n - uruchomienie gry od nowa\n"
        );
        System.out.println("Wciśnij klawisz :");


        while (!end) {
            if (roundNumber <= roundToPlay.getRoundsToPlay()) {
                if (roundNumber > 1){
                    System.out.println("Wciśnij klawisz :");
                }
                String keyPressed = scanner.nextLine();
                if ("x".equals(keyPressed)) {
                    System.out.println("Czy napewno zakonczyc gre ? Wpisz tak lub nie : ");
                    exit = scanner.nextLine();
                    if ("tak".equals(exit)) {
                        System.out.println("Gra zakończona");
                        end = true;
                    } else if ("nie".equals(exit)) {
                        System.out.println("Wciśnij klawisz :");
                        keyPressed = scanner.nextLine();
                    }
                }
                if ("n".equals(keyPressed)) {
                    System.out.println("Czy napewno zakonczyc aktualna gre i rozpoczac nowa ? Wpisz tak lub nie : ");
                    exit = scanner.nextLine();
                    if ("tak".equals(exit)) {
                        System.out.println("Gra zakończona");
                        rpsProcessor();
                    } else if ("nie".equals(exit)) {
                        System.out.println("Wciśnij klawisz :");
                        keyPressed = scanner.nextLine();
                    }
                }
                if ("1".equals(keyPressed) || "2".equals(keyPressed) || "3".equals(keyPressed)) {
                    System.out.println(player.getName() + " :");
                    if ("1".equals(keyPressed)) {
                        System.out.println("Kamien");
                        playerCall = 1;
                    }
                    if ("2".equals(keyPressed)) {
                        System.out.println("Papier");
                        playerCall = 2;
                    }
                    if ("3".equals(keyPressed)) {
                        System.out.println("Nozyce");
                        playerCall = 3;
                    }
                    System.out.println(computer.getName() + " :");
                    computerCall = randomNumber.nextInt(2) + 1;

                    if (computerCall == 1){
                        System.out.println("Kamien");
                    }
                    if (computerCall == 2){
                        System.out.println("Papier");
                    }
                    if (computerCall == 3){
                        System.out.println("Nozyce");
                    }
                    if (playerCall == 1 & computerCall == 3){
                        System.out.println("Wygrales!!!");
                        player.addWin();
                    } else if (playerCall == 1 & computerCall == 2){
                        System.out.println("Przegrales!!!");
                        computer.addWin();
                    } else if (playerCall == 1 & computerCall == 1){
                        System.out.println("Remis!!!");
                        player.addWin();
                        computer.addWin();
                    }
                    if (playerCall == 2 & computerCall == 1){
                        System.out.println("Wygrales!!!");
                        player.addWin();
                    } else if (playerCall == 2 & computerCall == 3){
                        System.out.println("Przegrales!!!");
                        computer.addWin();
                    } else if (playerCall == 2 & computerCall == 2){
                        System.out.println("Remis!!!");
                        player.addWin();
                        computer.addWin();
                    }
                    if (playerCall == 3 & computerCall == 2){
                        System.out.println("Wygrales!!!");
                        player.addWin();
                    } else if (playerCall == 3 & computerCall == 1){
                        System.out.println("Przegrales!!!");
                        computer.addWin();
                    } else if (playerCall == 3 & computerCall == 3){
                        System.out.println("Remis!!!");
                        player.addWin();
                        computer.addWin();
                    }
                }
                roundNumber = roundNumber + 1;
            }else{
                System.out.println("Gra zakończona !!!\n" + computer.getName() + " : " + computer.getWins() +" | "+ player.getName() + " : " + player.getWins());
                end = true;
            }
        }
    }
}




