public class Player {

    private String name;
    private int wins;

    public Player(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", wins=" + wins +
                '}';
    }

    public void addWin(){
        wins++;
        System.out.println("\nWygrales!!!\n");
    }


}
