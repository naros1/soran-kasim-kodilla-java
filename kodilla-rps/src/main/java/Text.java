import java.util.Optional;
import java.util.Scanner;

public interface Text {

    static void instruction(){
        System.out.println(
                "Obsługa gry : \n" + "klawisz 1 - zagranie \"kamien\"\n" +
                        "klawisz 2 - zagranie \"papier\"\n" + "klawisz 3 - zagranie \"nożyce\"\n" +
                        "klawisz x - zakonczenie gry\n" + "klawisz n - uruchomienie gry od nowa\n"
        );

    }

    static boolean exitGame(Scanner scanner){
        System.out.println("Czy napewno zakonczyc gre ? Wpisz tak lub nie : ");
        String exit = scanner.nextLine();
        if ("tak".equals(exit)) {
            System.out.println("Gra zakończona");
            return true;
        } else {
            return false;
        }
    }

    static boolean startNewGame(Scanner scanner){
        System.out.println("Czy napewno zakonczyc aktualna gre i rozpoczac nowa ? Wpisz tak lub nie : ");
        String exit = scanner.nextLine();
        if ("tak".equals(exit)) {
            System.out.println("Gra zakończona");
            Rps rps = new Rps();
            rps.rpsProcessor();
            return true;
        } else {
            return false;
        }
    }

}
